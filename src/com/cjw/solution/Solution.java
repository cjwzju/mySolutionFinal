package com.cjw.solution;

import java.util.Scanner;

import com.cjw.student.Student;

/**
 * 先在一个类中，完成基本功能，然后再 做成类或者接口
 * @author chaijunwei
 *
 */
public class Solution {

	public static int nums[]=new int[3]; 
	public static void main(String[] args) {
		System.out.println("请输入3个不同的个位数，并用','隔开：");
		
		Scanner in=new Scanner(System.in);
		String specialNum=in.nextLine();
		String[] snum=specialNum.split(",");

		nums[0]=Integer.parseInt(snum[0]);
		nums[1]=Integer.parseInt(snum[1]);
		nums[2]=Integer.parseInt(snum[2]);
				
//		System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
		
		for(int i=1;i<=100;i++)
		{
			new Student(i).say();
		}

	}	
	
}
