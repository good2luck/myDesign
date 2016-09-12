package com.pattern._8filter.demo;

import java.util.ArrayList;
import java.util.List;

import com.pattern._8filter.base.Person;
import com.pattern._8filter.master.AndCriteria;
import com.pattern._8filter.master.Criteria;
import com.pattern._8filter.master.CriteriaFemale;
import com.pattern._8filter.master.CriteriaMale;
import com.pattern._8filter.master.CriteriaSingle;
import com.pattern._8filter.master.OrCriteria;

/**
 * @description 使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表
 * @author xudj
 * @date 2016年9月6日 下午9:38:55
 * @version 1.0
 */
public class CriterPatternDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John","Male", "Married"));
		persons.add(new Person("Laura","Female", "Married"));
		persons.add(new Person("Diana","Female", "Single"));
		persons.add(new Person("Mike","Male", "Single"));
		persons.add(new Person("Bobby","Male", "Single"));
		
		Criteria male = new CriteriaMale();			//男性
		Criteria female = new CriteriaFemale();		//女性
		Criteria single = new CriteriaSingle();		//单身
		Criteria singleMale = new AndCriteria(single, male);	//单身男性
		Criteria singleOrFemale = new OrCriteria(single, female);//单身或女性
		
		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
		
	}

	/**
	 * @description 输出人信息
	 * @author xudj
	 * @date 2016年9月6日 下午9:46:56
	 * @param persons
	 */
	public static void printPersons(List<Person> persons){
		for (Person person : persons) {
			System.out.println("Person : [Name:"
					+ person.getName() + ", Gender:" +person.getGender()
					+ ", Marital Status:" + person.getMaritalStatus() + "]");
		}
	}
}
