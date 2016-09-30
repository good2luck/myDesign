package com.pattern3._3compositeEntity.master;

/**
 * 使用组合实体的客户端类
 * @author newuser
 */
public class Client {

	private CompositeEntity compositeEntity = new CompositeEntity();
	
	//打印数据
	public void printData(){
		for (String data : compositeEntity.getData()) {
			System.out.println("Data: " + data);
		}
	}
	
	//设置数据
	public void setData(String data1, String data2){
		compositeEntity.setData(data1, data2);
	}
	
}
