package cn.java.io.demo.functionStream;

import java.io.Serializable;

public class Student implements Serializable
{
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private int age;
    
    public Student(long id, String name, int age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student()
    {
    }
    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
}
