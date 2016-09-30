/**
 * @descrition 数据访问对象模式
 * @author xudj
 * @date 2016年9月30日 下午12:58:53
 * @version 1.0
 */
/**
 * 数据访问对象模式（Data Access Object Pattern）或DAO模式用于把低级的数据访问API或操作从高级的业务服务中分离出来。
 * 以下是数据访问对象模式的参与者。
 * 数据访问对象接口（Data Access Object Interface）：该接口定义了一个模型对象上要执行的标准操作。
 * 数据访问对象实体类（Date Access Object concrete class）：该类实现了上述的接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是xml，或者是其他的存储机制。
 * 模型对象/数值对象（Model Object/Value Object）：该对象是简单的POJO，包含了get/set方法来存储通过使用DAO类检索到的数据。
 */
package com.pattern3._4dataAccessObject;