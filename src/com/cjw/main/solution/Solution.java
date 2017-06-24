package com.cjw.main.solution;

import java.util.Scanner;

import com.cjw.main.inter.InterRule;
import com.cjw.main.rule.Rule;
import com.cjw.main.student.Student;

/**
 * 先在一个类中，完成基本功能，然后再 做成类或者接口
 * @author chaijunwei
 *
 */
public class Solution {

	
	public static void main(String[] args) {
		System.out.println("请输入3个不同的个位数，并用','隔开：");
		int nums[]=new int[3]; //3个特殊的数字；
		Scanner in=new Scanner(System.in);
		String specialNum=in.nextLine();
		String[] snum=specialNum.split(",");//3个特殊的数字的字符串形式；

		nums[0]=Integer.parseInt(snum[0]);
		nums[1]=Integer.parseInt(snum[1]);
		nums[2]=Integer.parseInt(snum[2]);				

		InterRule interRule=new Rule(nums[0],nums[1],nums[2]);
		for(int i=1;i<=100;i++)
		{
			new Student(i,interRule).say();
		}
	}		
}
