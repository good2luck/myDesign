package com.pattern._5prototype.base;

/**
 * @description 形状抽象类
 * @author xudj
 * @date 2016年8月9日 下午7:43:03
 * @version 1.0
 */
public abstract class Shape implements Cloneable {

	private String id;
	protected String type;
	
	public abstract void draw();	//画
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Object clone(){
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
