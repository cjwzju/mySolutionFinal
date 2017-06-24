package com.cjw.main.student;

import com.cjw.main.inter.InterRule;

/**
 * 现在开始 使用面向对象 的 思想，把学生单独做成一个类；
 * 让学生 本人自己 完成报数；
 * @author chaijunwei
 *
 */
public class Student {

	int id;//学生编号；
	InterRule interRule;//下面用 接口来调用方法；
	public Student(int id1,InterRule interRule1)
	{
		id=id1;
		interRule=interRule1;
	}
	
	public void say()//输出结果的函数；
	{
		System.out.println(interRule.rulesay(id));
	}
}
