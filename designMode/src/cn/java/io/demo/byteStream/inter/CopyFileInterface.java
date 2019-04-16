package cn.java.io.demo.byteStream.inter;

import java.io.File;

public interface CopyFileInterface {

	/**
	* ʹ���ֽ�����ȡ�����ֽڵķ�ʽ�����ļ�
	*/
	public void copyFileByByte(File src, File target);
	
	/**
	* ʹ���ֽ�����ȡ�ֽ�����ķ�ʽ�����ļ�
	*/
	public void copyFileByByteArray(File src, File target);
	
	/**
	* ʹ���ֽ�����������ȡ�����ֽڵķ�ʽ�����ļ�
	*/
	public void copyFileByBufferAndByte(File src, File target);
	
	/**
	* ʹ���ֽ�����������ȡ�ֽ�����ķ�ʽ�����ļ�
	*/
	public void copyFileByBufferAndByteArray(File src, File target);

}
