package com.pattern2._1memento.demo;

import com.pattern2._1memento.master.CareTaker;
import com.pattern2._1memento.master.Originator;

/**
 * 备忘录模式Demo
 * @author newuser
 */
public class MementoPatternDemo {

	public static void main(String[] args) {
		Originator originator = new Originator();		//用于存储
		CareTaker careTaker = new CareTaker();			//用于读取

		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());//存储
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());//存储	
		originator.setState("State #4");

		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());

	}

}
