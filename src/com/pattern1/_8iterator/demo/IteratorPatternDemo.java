package com.pattern1._8iterator.demo;

import com.pattern1._8iterator.base.Iterator;
import com.pattern1._8iterator.master.NameRepository;

/**
 * @description 使用 NameRepository 来获取迭代器，并打印名字。
 * @author xudj
 * @date 2016年9月21日 下午8:38:47
 * @version 1.0
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		
		Iterator iterator = nameRepository.getIterator();//获取迭代器
		
		for(;iterator.hasNext();){
			String name = (String) iterator.next();
			System.out.println("Name:" + name);
		}
		
	}
	
}
