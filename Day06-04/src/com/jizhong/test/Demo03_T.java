package com.jizhong.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jizhong.pojo.Book;

/**
 *	泛型
 *	好处：把运行时异常 提到 编译期异常
 */
public class Demo03_T {
	public static void main(String[] args) {
//		Map<K, V> m = new HashMap<>();
//		Map<String, String> m = new HashMap<>();
		
		//泛型就是所有类型，你传什么类型，那么E就是什么类型
//		List<Book> list = new ArrayList<Book>();
		
		//没有泛型
		//泛型如果不定义，默认为Object
		List<String> list = new ArrayList();
		list.add("v");//Integer	//编译期异常
		list.add("a");//String
		
		//增强for循环遍历集合
		for (Object object : list) {
			//如果只是单纯的存储数据，泛型可以不定义
//			System.out.println(object);
			
			
			//打印字符串 "a"的长度
			String s = (String)object;
			System.out.println(s.length());
		}
		
	}
}
