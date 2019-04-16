package cn.java.io.demo.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo
{
    public static void main(String[] args)
    {
        try
        {
            test2();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * read as byte[]
     * @throws IOException
     */
    private static void test2()  throws IOException
    {
        FileInputStream inputStream = new FileInputStream(new File("a/a.txt"));
        byte[] byts = new byte[1024];
        int length=0;
        while((length = inputStream.read(byts))!=-1){
            System.out.println(new String(byts));
        }
        inputStream.close();
    }

    /**
     * read as byte
     * @throws IOException
     */
    private static void test1() throws IOException
    {
        FileInputStream inputStream = new FileInputStream(new File("a/a.txt"));
        byte byt = 0;
        while((byt=(byte)inputStream.read()) != -1){
            System.out.println(byt);
        }
        inputStream.close();
    }
    
    
}
