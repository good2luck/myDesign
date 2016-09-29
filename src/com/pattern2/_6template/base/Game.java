package com.pattern2._6template.base;

/**
 * 定义操作的Game抽象类
 * @author newuser
 */
public abstract class Game {

	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	//模板方法，定义成final
	public final void play(){
		//初始化游戏
		initialize();
		
		//开始游戏
		startPlay();
		
		//结束游戏
		endPlay();
	}
	
}