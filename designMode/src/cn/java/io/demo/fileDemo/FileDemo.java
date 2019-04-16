package cn.java.io.demo.fileDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileDemo
{
    public static void main(String[] args)
    {
        test14();
    }
    
    

    private static void test14()
    {
        
    }



    private static void test13()
    {
        File[] roots = File.listRoots();
        for (File file : roots)
        {
            System.out.println(file);
        }
    }


    /**
     * filter files as File[]
     */
    private static void test12()
    {
        File file = new File("a");
        File[] files = file.listFiles(new FileFilter()
        {
            
            @Override
            public boolean accept(File pathname)
            {
                if(pathname.isDirectory()){
                    return false;
                }
                
                return !(pathname.getName().endsWith(".json") || pathname.getName().endsWith(".txt")) ;
            }
        });
        
        for (File file2 : files)
        {
            System.out.println(file2);
        }
    }



    /**
     * filter files as String[]
     */
    private static void test11()
    {
        File file = new File("a");
        String[] list = file.list(new FilenameFilter(){

            @Override
            public boolean accept(File dir, String name)
            {
                return name.endsWith(".json");
            }
            
        });
        for (String str : list)
        {
            System.out.println(str);
        }
    }



    /**
     * get
     */
    private static void test10()
    {
        File file = new File("a/a.txt");
        System.out.println(new Date(file.lastModified()));
    }



    /**
     * length
     */
    private static void test9()
    {
        File file = new File("a/a.txt");
        System.out.println(file.length());
    }



    /**
     * get
     */
    private static void test8()
    {
        File file = new File("a/a.txt");
        System.out.println(file.getAbsoluteFile());
        
        System.out.println(file.getAbsolutePath());
    }



    /**
     * delete
     */
    private static void test7()
    {
        File file = new File("a/b/c");
        System.out.println(file.delete());
    }



    /**
     * set
     */
    private static void test6()
    {
        File file = new File("a/aBack.txt"); 
        System.out.println( file.setLastModified(new Date().getTime()));
        
        System.out.println(new Date(file.lastModified()));
    }



    /**
     * rename file name at current directory or copy file to anthor directory
     */
    private static void test5()
    {
        File file = new File("a/b/c/d.json"); 
        System.out.println( file.renameTo(new File("a/aBack.txt")));
    }



    /**
     * judge method
     */
    private static void test4()
    {
        File file = new File("a/a.txt"); 
        System.out.println(file.exists());
        
        System.out.println(file.isDirectory());
        
        System.out.println(file.isFile());
        
        System.out.println(file.isHidden());
        
        System.out.println(file.canRead());
        
        System.out.println(file.canWrite());
    }



    
    /**
     * create new file 
     */
    private static void test3()
    {
        try
        {
            File file = new File("a/a.txt"); 
            System.out.println(file.createNewFile());
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    /**
     * create multi path
     */
    public static void test2()
    {
      File file = new File("c/d");   
      System.out.println(file.mkdir());
      System.out.println(file.mkdirs());
    }

    /**
     * create new file or path
     * @return true if make success;false if makse fail reasons such as is making directory have been exist
     */
    public static void test1()
    {
        File file = new File("a/c");
        boolean isSuccess = file.mkdir();
        System.out.println(isSuccess);
    }
    
    
}