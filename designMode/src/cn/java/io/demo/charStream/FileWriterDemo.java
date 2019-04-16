package cn.java.io.demo.charStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileWriterDemo
{
    /**
     * 字符流便捷类
     * 字符流 FileWriter ，父类 OutputStreamWriter
     */
    @Test
    public void test(){
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter(new File("a/a.txt"),true);
            fileWriter.write("你好 中国");
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally{
            if(fileWriter != null){
                try
                {
                    fileWriter.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        
    }
}
