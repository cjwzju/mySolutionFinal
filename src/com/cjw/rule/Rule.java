package com.cjw.rule;

import com.cjw.solution.Solution;

/**
 * 决定 把 报数规则 单独拿出来，放到一个类里面；
 * 
 * 为了实现 在  Student类中的say()函数中 调用的解耦，现在做一个接口，在 say()函数中用接口 调用 rulesay()方法，
 * 这样 当 rulesay（）用其他的方法实现时，就不用 进行更改调用了； 
 * @author chaijunwei
 *
 */
public class Rule {
	
		//为了让Student类 具有自己 完成 单独报数的功能，要对 say()函数进行相应修改，
		//完成报数的函数；
		static int nums[]=Solution.nums;
		public static String rulesay(int id)
		{		
			String result="";//输出的结果
			boolean isSpecial=false;//是否需要报单词（即：是否特殊号码）
					//规则（6）的优先级最高，2、3、4、5可以用字符拼接完成；
				if((id%10-nums[0]==0)||(id-(nums[0]*10)>=0)&&(id-(nums[0]*10)<10))
				{
					result="Fizz";
					isSpecial=true;
				}
				else
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
