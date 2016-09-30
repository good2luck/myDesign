/**
 * @descrition 服务定位器模式
 * @author xudj
 * @date 2016年9月30日 下午2:38:53
 * @version 1.0
 */
/**
 * 服务定位器模式（Service Localtor Pattern）用在我们想使用JNDI查询定位各种服务的时候。考虑到为某个服务查找JDNI的代价很高，
 * 服务定位器模式充分利用了缓存技术。在首次请求某个服务时，服务定位器在JDNI中查找服务，并缓存该服务对象。当再次请求相同的服务时，服务
 * 定位器会在它的缓存中查找，这样可以在很大程度上提高应用程序的性能。
 * 以下是这种设计模式的实体。
 * 服务（Service）：实际处理请求的服务。对这种服务的引用可以在JNDI服务器中查找到。
 * Context/初始化的Context：JNDI Context带有对要查找的服务的应用。
 * 服务定位器（Service Localtor）：服务定位器是通过JNDI查找和缓存服务来获取服务的单点接触。
 * 缓存（Cache）：缓存存储服务的引用，以便复用它们。
 * 客户端（Client）：Client是通过ServiceLocaltor调用服务的对象。
 */
package com.pattern3._7serviceLocator;