package cn.java.io.demo.byteStream.inter;

import java.io.File;

public interface CopyFileInterface {

	/**
	* 使用字节流读取单个字节的方式复制文件
	*/
	public void copyFileByByte(File src, File target);
	
	/**
	* 使用字节流读取字节数组的方式复制文件
	*/
	public void copyFileByByteArray(File src, File target);
	
	/**
	* 使用字节流缓冲区读取单个字节的方式复制文件
	*/
	public void copyFileByBufferAndByte(File src, File target);
	
	/**
	* 使用字节流缓冲区读取字节数组的方式复制文件
	*/
	public void copyFileByBufferAndByteArray(File src, File target);

}
