package com.cjw.main.inter;

import com.cjw.main.solution.Solution;

/**
 * 报数规则的接口，不同的类可以实现它，进而用不同的方法实现报数；
 * @author chaijunwei
 *
 */
public interface InterRule {

	
	
	//根据 学生的id，返回其应当报的数；
	public  String rulesay(int id) ;
}
