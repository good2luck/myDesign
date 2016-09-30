package com.pattern3._3compositeEntity.base;

/**
 * 粗粒度对象
 * @author newuser
 */
public class CoarseGrainedObject {
	
	private DependentObject1 dependentObject1 = new DependentObject1();
	private DependentObject2 dependentObject2 = new DependentObject2();
	
	//设置数据
	public void setData(String data1, String data2){
		this.dependentObject1.setData(data1);
		this.dependentObject2.setData(data2);
	}
	
	//获取数据
	public String[] getData(){
		return new String[]{dependentObject1.getData(), dependentObject2.getData()};
	}
	
}
