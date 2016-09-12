package com.pattern._4builder.master;

/**
 * @description 创建者模式Demo
 * @author xudj
 * @date 2016年8月5日 下午3:52:01
 * @version 1.0
 */
public class BuiderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal meal = mealBuilder.prepareVegMeal();//素食+可乐
		System.out.println("Veg Meal:");
		meal.showItems();//账单
		System.out.println("总价:"+meal.getCost());
		
		meal = mealBuilder.prepareNonVegMeal();//鸡肉+百事
		System.out.println("\n\nNon-Veg Meal:");
		meal.showItems();//账单
		System.out.println("总价:"+meal.getCost());
	}
	
}
