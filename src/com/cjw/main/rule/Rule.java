package com.cjw.main.rule;

import com.cjw.main.inter.InterRule;

/**
 * 为了实现 在  Student类中的say()函数中 调用的解耦，现在做一个接口，在 say()函数中用接口InterRule调用 rulesay()方法，
 * 这样 当 rulesay（）用其他的方法实现时，就不用 进行更改调用了； 
 * @author chaijunwei
 *
 */
public class Rule implements InterRule{
	
		int nums[]=new int[3];//用来存放三个特殊数字；
		public Rule(int i0,int i1,int i2)
		{
			nums[0]=i0;
			nums[1]=i1;
			nums[2]=i2;
		}
		//完成 按照规则进行报数的函数；（传入学生id）
		public  String rulesay(int id)
		{		
			String result="";//输出的结果
			boolean isSpecial=false;//是否需要报单词（即：是否特殊号码）
			//规则（6）的优先级最高，2、3、4、5条规则 可以用字符拼接完成；
			//判断规则（6）
			if((id%10-nums[0]==0)||(id-(nums[0]*10)>=0)&&(id-(nums[0]*10)<10))
			{
				result="Fizz";
				isSpecial=true;
			}
			else	//判断规则（2、3、4、5）
			{
				if(id%nums[0]==0)
				{
					result+="Fizz";
					isSpecial=true;
				}
				if(id%nums[1]==0)
				{
					result+="Buzz";
					isSpecial=true;
				}
				if(id%nums[2]==0)
				{
					result+="Whizz";
					isSpecial=true;
				}
			}
			if(!isSpecial)//非特殊号码，不报单词
			{
				result=id+"";
			}
			return result;					
		}
}
