package com.pattern1._4proxy.base;

/**
 * @description RealImage实现Image接口
 * @author xudj
 * @date 2016年9月12日 下午7:43:21
 * @version 1.0
 */
public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}


	@Override
	public void display() {
		System.out.println("Display " + fileName);
	}

	/** 从磁盘中加载 */
	private void loadFromDisk(String fileName2) {
		System.out.println("Loading " + fileName);
	}
}
