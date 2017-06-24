package com.cjw.solution;

import java.util.Scanner;

/**
 * 先在一个类中，完成基本功能，然后再 做成类或者接口
 * @author chaijunwei
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println("请输入3个不同的个位数，并用','隔开：");
		
		Scanner in=new Scanner(System.in);
		String specialNum=in.nextLine();
		String[] snum=specialNum.split(",");
		int [] nums={Integer.parseInt(snum[0]),Integer.parseInt(snum[1]),Integer.parseInt(snum[2])};

		
		Solution.say(nums);	

	}
	
	
}
