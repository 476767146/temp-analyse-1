package com.zdjy.bigdata.temp_analyse_hadoop.test;

import org.junit.Test;

import com.zdjy.bigdata.temp_analyse_hadoop.count_by_city_month.MyKey;

public class CountTest {
	@Test
	public void test001(){
		String aString="上海    上海    2011-01-01      6       2       4       4       多云~雨夹雪 北风 4-5级";
		String[] split = aString.split("[\\s-]+");
		System.out.println(split.length);
	}
	
	@Test
	public void test002(){
		MyKey myKey = new MyKey();
		myKey.setCity("aa");
		myKey.setMonth("bb");
		MyKey myKey2 = new MyKey();
		myKey2.setCity("aa");
		myKey2.setMonth("bb");
		System.out.println(myKey.hashCode());
		System.out.println(myKey2.hashCode());
	}
}
