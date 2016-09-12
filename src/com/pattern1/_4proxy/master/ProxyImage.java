package com.pattern1._4proxy.master;

import com.pattern1._4proxy.base.Image;
import com.pattern1._4proxy.base.RealImage;

/**
 * @description 代理Image实现Image接口
 * @author xudj
 * @date 2016年9月12日 下午7:46:02
 * @version 1.0
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
