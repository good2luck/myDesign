package com.pattern2._6template.demo;

import com.pattern2._6template.base.Cricket;
import com.pattern2._6template.base.Football;
import com.pattern2._6template.base.Game;

/**
 * 模板模式Demo
 * @author newuser
 */
public class TemplatePatternDemo {

	public static void main(String[] args) {

		//板球
		Game cricket = new Cricket();
		cricket.play();
		
		System.out.println();
		
		//足球
		Game football = new Football();
		football.play();
	}

}
