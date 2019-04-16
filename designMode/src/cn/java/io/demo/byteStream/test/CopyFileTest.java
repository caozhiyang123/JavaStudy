package cn.java.io.demo.byteStream.test;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import cn.java.io.demo.byteStream.inter.CopyFileImpl;
import cn.java.io.demo.byteStream.inter.CopyFileInterface;
import cn.java.io.demo.byteStream.proxy.ProxyFactory;

public class CopyFileTest
{
    private CopyFileInterface copyFileInterface;
    
    private File src = new File("a/a.txt");
    
    @Before
    public void before(){
        ProxyFactory<CopyFileImpl> proxyFactory = new ProxyFactory<CopyFileImpl>(new CopyFileImpl());
        copyFileInterface = proxyFactory.getObject();
    }
    
    @Test
    public void test(){
        copyFileInterface.copyFileByByte(src, new File("a/ab1.txt"));
        copyFileInterface.copyFileByByteArray(src, new File("a/ab2.txt"));
        copyFileInterface.copyFileByBufferAndByte(src, new File("a/ab3.txt"));
        copyFileInterface.copyFileByBufferAndByteArray(src, new File("a/ab4.txt"));
    }
}
