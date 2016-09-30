package com.pattern3._6interceptingFilter.master;

import java.util.ArrayList;
import java.util.List;

import com.pattern3._6interceptingFilter.base.Filter;

/**
 * 过滤器链
 * @author newuser
 */
public class FilterChain {

	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;

	public FilterChain(Target target) {
		this.target = target;
	}

	//添加过滤器
	public void addFilter(Filter filter){
		filters.add(filter);
	}
	
	//执行过滤器
	public void excute(String request){
		for (Filter filter : filters) {
			filter.execute(request);
		}
		target.execute(request);
	}
	
	
	//设置执行程序
	public void setTarget(Target target) {
		this.target = target;
	}
}
