package cn.java.io.demo.byteStream.inter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileImpl implements CopyFileInterface
{

    /* 
     * 单字节读取但字节输出
     */
    @Override
    public void copyFileByByte(File src, File target)
    {

        FileInputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try
        {
            inputStream = new FileInputStream(src);
            fileOutputStream = new FileOutputStream(target,true);
            int byt = 0;
            while((byt=inputStream.read()) != -1){
                fileOutputStream.write(byt);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }finally{
            if(inputStream != null){
                try
                {
                    inputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream != null){
                try
                {
                    fileOutputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    /* 
     * 读取到字节数组并输出
     */
    @Override
    public void copyFileByByteArray(File src, File target)
    {

        FileInputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try
        {
            inputStream = new FileInputStream(src);
            fileOutputStream = new FileOutputStream(target,true);
            byte[] byts = new byte[1024];
            int length = 0;
            while((length = inputStream.read(byts)) != -1){
                fileOutputStream.write(byts,0,length);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }finally{
            if(inputStream != null){
                try
                {
                    inputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream != null){
                try
                {
                    fileOutputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    
        
    }

    /* 
     * 使用缓冲流单字节读取，单字节输出
     */
    @Override
    public void copyFileByBufferAndByte(File src, File target)
    {

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try
        {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(target,true));
            int b = 0;
            while((b = bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(b);
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

    /* 
     * 使用缓冲流读取到字节数组并输出
     */
    @Override
    public void copyFileByBufferAndByteArray(File src, File target)
    {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try
        {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(target,true));
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
