package com.zdjy.bigdata.temp_analyse_hadoop.test;

import org.junit.Test;

public class ETLTest {
	@Test
	public void test001(){
		String string = "阿城    2011-01-01 -12 -25 晴 西北风~西南风 3-4级~微风";
		System.out.println(string.split("\\s+").length);
		System.out.println(string.split("\\s+",5)[4]);
	}
}
