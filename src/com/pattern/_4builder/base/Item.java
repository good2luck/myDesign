package com.pattern._4builder.base;

/**
 * @description 创建一个表示食物条目的接口
 * @author xudj
 * @date 2016年8月5日 下午3:14:52
 * @version 1.0
 */
public interface Item {
	
	public String name();
	public Packing packing();
	public float price();
}