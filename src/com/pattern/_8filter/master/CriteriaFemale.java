package com.pattern._8filter.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern._8filter.base.Person;

/**
 * @description CriteriaFemale
 * @author xudj
 * @date 2016年9月6日 下午9:19:24
 * @version 1.0
 */

public class CriteriaFemale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
