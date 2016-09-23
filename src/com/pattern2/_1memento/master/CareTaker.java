package com.pattern2._1memento.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern2._1memento.base.Memento;

/**
 * Caretaker 对象负责从 Memento 中恢复对象的状态
 * 		相当于备忘录管理类
 * @author newuser
 */
public class CareTaker {

	private List<Memento> mementoList = new ArrayList<Memento>();
	
	//记录状态
	public void add(Memento memento){
		mementoList.add(memento);
	}
	
	//获取第i次的记录状态
	public Memento get(int index){
		return mementoList.get(index);
	}
	
}
