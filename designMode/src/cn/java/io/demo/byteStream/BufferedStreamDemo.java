package cn.java.io.demo.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo
{
    public static void main(String[] args)
    {
        test1();
    }

    /**
     * 使用缓冲字节流复制文件
     */
    private static void test1()
    {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try
        {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("a/a.txt")));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("a/aback.txt")));
            byte[] byts = new byte[1024];
            int length = 0;
            while((length = bufferedInputStream.read(byts))!=-1){
                bufferedOutputStream.write(byts, 0, length);
                bufferedOutputStream.flush();
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally{
            if(bufferedInputStream != null){
                try
                {
                    bufferedInputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            
            if(bufferedOutputStream != null){
                try
                {
                    bufferedOutputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            
        }
        
    }
    
    
}
