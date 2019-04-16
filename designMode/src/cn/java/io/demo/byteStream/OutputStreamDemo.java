package cn.java.io.demo.byteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo
{
    public static void main(String[] args)
    {
            test1();
    }

    /**
     * 1.向a/a.txt 文件尾部追加hello world(注意时追加，且要换行)
     * 2.异常处理,流关闭处理
     * @throws Exception 
     */
    private static void test1()
    {
        FileOutputStream outputStream = null;
        try
        {
            outputStream = new FileOutputStream(new File("a/a.txt"),true);
            outputStream.write(System.getProperty("line.separator").getBytes());
            outputStream.write("hello world".getBytes());
            outputStream.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally{
            if(outputStream!=null){
                try
                {
                    outputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
