package com.pattern._8filter.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern._8filter.base.Person;

/**
 * @description CriteriaMale
 * @author xudj
 * @date 2016年9月6日 下午9:16:50
 * @version 1.0
 */
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
