package com.cjw.test;

import com.cjw.main.inter.InterRule;
import com.cjw.main.rule.Rule;

/**
 * 用来测试 Rule 是否正常工作；
 * @author chaijunwei
 *
 */
public class TestRule {

	public static void main(String[] args) {
		
		InterRule interRule=new Rule(3,5,7);
		boolean bs[]=new boolean[5];
		bs[0]="Fizz".equals(interRule.rulesay(12));
		bs[1]="FizzBuzz".equals(interRule.rulesay(15));
		bs[2]="FizzWhizz".equals(interRule.rulesay(21));		
		bs[3]="Whizz".equals(interRule.rulesay(49));
		bs[4]="Buzz".equals(interRule.rulesay(80));		
		
		for(int i=0;i<bs.length;i++)
		{
			if(!bs[i])
			{
				System.out.println("测试 "+(i+1)+" 发生错误！");
				return ;
			}
		}
		System.out.println("测试成功！！！");
	}

}
