package com.pattern3._3compositeEntity.master;

import com.pattern3._3compositeEntity.base.CoarseGrainedObject;

/**
 * 组合实体
 * @author newuser
 */
public class CompositeEntity {

	private CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();
	
	//设置数据
	public void setData(String data1, String data2){
		coarseGrainedObject.setData(data1, data2);
	}
	
	//获取数据
	public String[] getData(){
		return coarseGrainedObject.getData();
	}
	
}
