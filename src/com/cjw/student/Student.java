package com.cjw.student;

import com.cjw.rule.Rule;

/**
 * 现在开始 使用面向对象 的 思想，把学生单独做成一个类；
 * 让学生 本人自己 完成报数；
 * @author chaijunwei
 *
 */
public class Student {

	int Id;//学生编号；
	
	public Student(int id)
	{
		Id=id;
	}
	
	public void say()//输出结果的函数；
	{
		System.out.println(Rule.rulesay(Id));
	}
}
