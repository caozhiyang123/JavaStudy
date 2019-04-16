package cn.java.io.demo.charStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FileWriterDemo
{
    /**
     * �ַ��������
     * �ַ��� FileWriter ������ OutputStreamWriter
     */
    @Test
    public void test(){
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter(new File("a/a.txt"),true);
            fileWriter.write("��� �й�");
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
