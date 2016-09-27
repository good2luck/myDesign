package com.pattern2._3state.base;

import com.pattern2._3state.master.Context;

/**
 * @description 创建一个状态接口
 * @author xudj
 * @date 2016年9月27日 下午7:13:27
 * @version 1.0
 */
public interface State {

	public void doAction(Context context);
	
}
