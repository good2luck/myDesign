/**
 * @descrition 组合实体模式
 * @author xudj
 * @date 2016年9月30日 上午11:46:53
 * @version 1.0
 */
/**
 * 组合实体模式（Composite Entity Pattern）用在EJB持久化机制中。一个组合实体是一个EJB实体bean，代表了对象的图解。当更新一个
 * 组合实体时，内部依赖对象beans会自动更新，因为它们是有EJB实体bean管理的。
 * 以下是组合实体bean的参与者。
 * 组合实体（Composite Entity）：它是主要的实体bean。它可以是粗粒度的，或者可以包含一个粗粒度对象，用于持续生命周期。
 * 粗粒度对象（Coarse-Grained-Object）：该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。
 * 依赖对象（Dependent Object）：依赖对象是一个持续生命周期依赖于粗粒度对象的对象。
 * 策略（Strategies）：策略表示如果实现组合实体。
 */
package com.pattern3._3compositeEntity;