package com.pattern2._2observer.base;

import com.pattern2._2observer.master.Subject;

/**
 * @description 抽象观察者类
 * @author xudj
 * @date 2016年9月25日 上午6:53:46
 * @version 1.0
 */
public abstract class Observer {

	protected Subject subject;
	
	/**
	 * @description 更新状态，即被通知后的操作
	 * @author xudj
	 * @date 2016年9月25日 上午7:07:12
	 */
	public abstract void update();
}
