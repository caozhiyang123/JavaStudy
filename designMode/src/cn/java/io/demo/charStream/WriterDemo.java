package cn.java.io.demo.charStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 * 转换流：字节输出转字符输出流
 * 子类:OutputStreamWriter,BufferedWriter
 *
 */
public class WriterDemo
{
    
  @Test
  public void test(){
      OutputStreamWriter writer =  null;
      try
    {
        writer = new OutputStreamWriter(new FileOutputStream(new File("a/a.txt"),true));
        writer.write(System.getProperty("line.separator"));
        writer.write("你好 世界！");
        writer.write(System.getProperty("line.separator"));
        
        writer.write(97);//a
        writer.write(System.getProperty("line.separator"));
        
        writer.write(new char[]{97,98,99});//a,b,c
        writer.write(System.getProperty("line.separator"));
        
        writer.write(new char[]{97,98,99},1,1);
        writer.write(System.getProperty("line.separator"));
        
        writer.write("你好 世界！", 3, 2);
        writer.write(System.getProperty("line.separator"));
        
        writer.flush();
    } catch (Exception e)
    {
        e.printStackTrace();
    }finally{
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
