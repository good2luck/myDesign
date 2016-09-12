package com.pattern._8filter.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern._8filter.base.Person;

/**
 * @description 单身Criteria
 * @author xudj
 * @date 2016年9月6日 下午9:26:12
 * @version 1.0
 */

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singlePersons.add(person);
			}
		}
		
		return singlePersons;
	}

}
