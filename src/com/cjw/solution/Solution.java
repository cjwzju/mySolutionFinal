package com.cjw.solution;

import java.util.Scanner;

/**
 * 先在一个类中，完成基本功能，然后再 做成类或者接口
 * @author chaijunwei
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String specialNum=in.nextLine();
		String[] snum=specialNum.split(",");
		int [] nums={Integer.parseInt(snum[0]),Integer.parseInt(snum[1]),Integer.parseInt(snum[2])};
//		System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
		
		Solution.say(nums);	

	}
	
	//完成报数的函数；
	public static void say(int nums1[])
	{
		String result=null;//输出的结果
		boolean isSpecial=false;//是否需要报单词（即：是否特殊号码）
		int nums[]=nums1;
		for(int i=1;i<=100;i++)
		{
			result="";
			isSpecial=false;
			//规则（6）的优先级最高，2、3、4、5可以用字符拼接完成；
			if((i%10-nums[0]==0)||(i-(nums[0]*10)>=0)&&(i-(nums[0]*10)<10))
			{
				result="Fizz";
				isSpecial=true;
			}
			else
			{
				if(i%nums[0]==0)
				{
					result+="Fizz";
					isSpecial=true;
				}
				if(i%nums[1]==0)
				{
					result+="Buzz";
					isSpecial=true;
				}
				if(i%nums[2]==0)
				{
					result+="Whizz";
					isSpecial=true;
				}
			}
			if(!isSpecial)//非特殊号码，不报单词
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(result);
			}
		}		
	}
}
