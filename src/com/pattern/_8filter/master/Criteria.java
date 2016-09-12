package com.pattern._8filter.master;

import java.util.List;

import com.pattern._8filter.base.Person;

/**
 * @description 创建一个标准(Criteria)接口
 * @author xudj
 * @date 2016年9月6日 下午9:14:20
 * @version 1.0
 */
public interface Criteria {

	//符合标准的人集合
	List<Person> meetCriteria(List<Person> persons);
	
}
