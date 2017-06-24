package com.cjw.student;

import com.cjw.inter.InterRule;
import com.cjw.rule.Rule;

/**
 * 现在开始 使用面向对象 的 思想，把学生单独做成一个类；
 * 让学生 本人自己 完成报数；
 * @author chaijunwei
 *
 */
public class Student {

	int Id;//学生编号；
	InterRule interRule=new Rule();//下面用 接口来调用方法；
	public Student(int id)
	{
		Id=id;
	}
	
	public void say()//输出结果的函数；
	{
		System.out.println(interRule.rulesay(Id));
	}
}
