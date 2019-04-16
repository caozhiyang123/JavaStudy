package cn.java.io.demo.functionStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

@SuppressWarnings("all")
public class ObjectOutputStreamDemo
{
    
    /**
     * Deserialize
     */
    @Test
    public void test2(){
        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("a/a.txt"))));
            Object obj = inputStream.readObject();
            if(obj instanceof Student){
                System.out.println(((Student)obj).toString());
            }else if(obj instanceof List){
                List list = (List)obj;
                for (Object object : list)
                {
                    if(object instanceof Student){
                        System.out.println(((Student)object).toString());
                    }
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally{
            if(inputStream != null){
                try
                {
                    inputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        
    }
    
    /**
     * Serializable
     */
    @Test
    public void test(){
        ObjectOutputStream outputStream = null;
        try
        {
            outputStream = new ObjectOutputStream(new FileOutputStream(new File("a/a.txt"),true));
            List<Student> list = new ArrayList<Student>();
            list.add(new Student(1,"anly",23));
            list.add(new Student(2,"sdf",23));
            list.add(new Student(3,"sdfsdfsdf",23));
            list.add(new Student(4,"wqeqw",23));
            list.add(new Student(5,"sdfwe3",23));
            outputStream.writeObject(list);
            outputStream.flush();
         
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally{
            if(outputStream != null){
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
