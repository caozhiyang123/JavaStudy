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
     * 1.��a/a.txt �ļ�β��׷��hello world(ע��ʱ׷�ӣ���Ҫ����)
     * 2.�쳣����,���رմ���
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
