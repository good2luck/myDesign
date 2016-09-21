package com.pattern1._8iterator.master;

import com.pattern1._8iterator.base.Container;
import com.pattern1._8iterator.base.Iterator;

/**
 * @description 创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator
 * @author xudj
 * @date 2016年9月21日 下午8:30:15
 * @version 1.0
 */
public class NameRepository implements Container {

	private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	/** 迭代内部类 */
	private class NameIterator implements Iterator{

		int index;
		
		@Override
		public boolean hasNext() {
			if(index < names.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(hasNext()){
				return names[index++];
			}
			return null;
		}
	}
	
}
