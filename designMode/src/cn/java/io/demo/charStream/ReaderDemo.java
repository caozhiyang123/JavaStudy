package cn.java.io.demo.charStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

/**
 * 转换流 ：字节输入转字符输入流
 * 子类：InputStreamReader,BufferedReader
 *
 */
public class ReaderDemo
{
    /**
     * 读取单个字符
     */
    @Test
    public void test1(){
        InputStreamReader reader = null;
        try
        {
            reader = new InputStreamReader(new FileInputStream(new File("a/a.txt")));
            int len = 0;
            while((len = reader.read())!= -1){
                System.out.println((char)len);
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
        }
    }
    
    /**
     * 读取到字符数组
     */
    @Test
    public void test2(){

        InputStreamReader reader = null;
        try
        {
            reader = new InputStreamReader(new FileInputStream(new File("a/a.txt")));
            char[] arr = new char[1024];
            int len = 0;
            while((len = reader.read(arr))!= -1){
                System.out.println(new String(arr,0,len));
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
        }
    
    }
}
