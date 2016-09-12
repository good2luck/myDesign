package com.pattern._4builder.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern._4builder.base.Item;

/**
 * @description  Meal类
 * @author xudj
 * @date 2016年8月5日 下午3:35:43
 * @version 1.0
 */
public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	//添加食物条目
	public void addItem(Item item){
		items.add(item);
	}
	
	//获取价格和
	public float getCost(){
		float total = 0;
		for (Item item : items) {
			total += item.price();
		}
		return total;
	}
	
	//显示食物条目
	public void showItems(){
		for (Item item : items) {
			System.out.println("name:"+item.name()+", packing:"+item.packing().pack()+", price:"+item.price());
		}
	}
	
}
