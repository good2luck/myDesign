package com.pattern._4builder.master;

import com.pattern._4builder.base.burger.ChickenBurger;
import com.pattern._4builder.base.burger.VegBurger;
import com.pattern._4builder.base.coldDrink.Coke;
import com.pattern._4builder.base.coldDrink.Pepsi;

/**
 * @description 食物创建类
 * @author xudj
 * @date 2016年8月5日 下午3:41:49
 * @version 1.0
 */
public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());		//素食汉堡
		meal.addItem(new Coke());			//可口可乐
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());		//鸡肉汉堡
		meal.addItem(new Pepsi());				//百事可乐
		return meal;
	}
	
	//还有两种组合，略
	
}
