package com.pattern._8filter.master;

import java.util.List;

import com.pattern._8filter.base.Person;

/**
 * @description or标准 满足其一即可
 * @author xudj
 * @date 2016年9月6日 下午9:34:45
 * @version 1.0
 */
public class OrCriteria implements Criteria{
	
	private Criteria criteria;			//标准1
	private Criteria otherCriteria;		//标准2
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> firstMeetPersons = this.criteria.meetCriteria(persons);
		List<Person> otherMeetPersons = this.otherCriteria.meetCriteria(persons);

		for (Person person : otherMeetPersons) {
			if(!firstMeetPersons.contains(person)){
				firstMeetPersons.add(person);
			}
		}
		return firstMeetPersons;
	}

}
