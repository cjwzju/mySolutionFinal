package com.cjw.newIdea;

import java.util.Scanner;
/**
 * 发现了一个更好的方法，可以显著降低圈复杂度，放在newIdea包中Solution2.java，验证了一下，效果很好； 
	老大看的时候，可以忽略这部分。哈哈
 * @author chaijunwei
 *
 */
public class Solution2 {

	public static void main(String[] args) {
		System.out.println("请输入3个不同的个位数，并用','隔开：");
		int nums[]=new int[3]; //3个特殊的数字；
		Scanner in=new Scanner(System.in);
		String specialNum=in.nextLine();
		String[] snum=specialNum.split(",");//3个特殊的数字的字符串形式；
		nums[0]=Integer.parseInt(snum[0]);
		nums[1]=Integer.parseInt(snum[1]);
		nums[2]=Integer.parseInt(snum[2]);		
		
		say(nums);

	}
	public static  void say(int nums[])//报数的函数；
	{
		int ids[]=new int[101];//0号不用；
		//之所以设置成 1、2、4，是因为 通过1、2、4三者间，两两结合，或者三者结合，正好能凑到 1、2、3、4、5、6、7
		//这7个数字，而Fizz、Buzz、Whizz三者的结合情况也正好是 7中，对应上了；
		processFirst(nums[0],1,ids);
		processFirst(nums[1],2,ids);
		processFirst(nums[2],4,ids);
		
		//规则（6）优先级最高，要单独处理
		for(int i=0;i<=9;i++)
		{
			ids[nums[0]*10+i]=1;//第一个特殊数在 个 位上的情况；
			ids[i*10+nums[0]]=1;//第一个特殊数在 十 位上的情况；
		}
		
		String[] words = new String[8];
		words[1] = "Fizz";//1
		words[2] = "Buzz";//2
		words[3] = "FizzBuzz";//3=1+2;
		words[4] = "Whizz";//4
		words[5] = "FizzWhizz";//5=1+4;
		words[6] = "BuzzWhizz";//6=2+4;
		words[7] = "FizzBuzzWhizz";//7=1+2+4;
		
		for(int i=1;i<=100;i++)
		{
			if(ids[i]==0)
				System.out.println(i+"");//输出原来的数据；
			else
				System.out.println(words[ids[i]]);//输出特殊的结果；
		}	
		
	}
	//提前处理 数据的函数；
	public static void processFirst(int a,int b,int ids[])
	{
		for(int i=1,j=100/a;i<=j;i++)
		{
			ids[i*a]+=b;//含义是：让a的倍数对应的学生 赋值为b；
		}
	}
}
