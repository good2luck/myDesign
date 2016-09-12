package com.pattern._8filter.master;

import java.util.List;

import com.pattern._8filter.base.Person;

/**
 * @description And组合标准，同时具备
 * @author xudj
 * @date 2016年9月6日 下午9:27:54
 * @version 1.0
 */
public class AndCriteria implements Criteria{

	private Criteria criteria;			//标准1
	private Criteria otherCriteria;		//标准2
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstMeetCriteria = this.criteria.meetCriteria(persons);
		return this.otherCriteria.meetCriteria(firstMeetCriteria);
	}
	
}
