package cn.java.io.demo.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class CopyFileDemo
{
    /**
     * 非缓冲流读写文件
     */
    @Test
    public void test(){

        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
        try
        {
            reader = new InputStreamReader(new FileInputStream(new File("a/a.txt")));
            writer = new OutputStreamWriter(new FileOutputStream(new File("a/aBack.txt"),true));
            char[] arr = new char[1024];
            int len = 0;
            while((len = reader.read(arr))!= -1){
                writer.write(arr, 0, len);
                writer.flush();
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }finally{
            if(reader != null){
                try
                {
                    reader.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(writer != null){
                try
                {
                    writer.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    
    }
    
    @Test
    public void test2(){
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try
        {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("a/a.txt"))));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("a/aBack.txt"))));
            String line = "";
            while((line = reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally{
            if(reader != null){
                try
                {
                    reader.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(writer != null){
                try
                {
                    writer.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
