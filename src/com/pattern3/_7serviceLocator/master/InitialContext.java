package com.pattern3._7serviceLocator.master;

import com.pattern3._7serviceLocator.base.Service1;
import com.pattern3._7serviceLocator.base.Service2;

/**
 * 为 JNDI 查询创建初始Context InitialContext
 * @author newuser
 */
public class InitialContext {
	//查询服务
	public Object lookUp(String jndiName){
		if(jndiName == null){//非空
			return null;
		}
		if(jndiName.equalsIgnoreCase("SERVICE1")){
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if(jndiName.equalsIgnoreCase("SERVICE2")){
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return null;
	}
}
