package com.pattern3._6interceptingFilter.master;

import com.pattern3._6interceptingFilter.base.Filter;

/**
 * 过滤管理器
 * @author newuser
 */
public class FilterManager {

	private FilterChain filterChain;		//过滤器链

	public FilterManager(Target target) {
		this.filterChain = new FilterChain(target);
	}
	
	//添加过滤器
	public void addFilter(Filter filter){
		filterChain.addFilter(filter);
	}
	
	//过滤请求
	public void filterRequest(String request){
		filterChain.excute(request);
	}
	
}
