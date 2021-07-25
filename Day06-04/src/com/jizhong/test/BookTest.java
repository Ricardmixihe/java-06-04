package com.jizhong.test;

import java.util.HashMap;
import java.util.Map;

import com.jizhong.pojo.Book;

/**
	1. 创建一个类BookTest，添加main方法，要求： 
	2. 使用HashMap进行存储，键为Book对象的编号，值为Book对象 
		key：编号 001
		value：book对象
	3. 通过某一个编号获取Book对象，并打印该Book对象的标题 
 */
public class BookTest {
	public static void main(String[] args) {
		//1. 创建Map集合
		Map<Integer, Book> bookMap = new HashMap<>();
		//2. 为Map集合中准备数据
		Book book1 = new Book("java的入门到放弃");
		Book book2 = new Book("C语言的入门到放弃");
		//3. 为Map集合添加数据 put(k,v)
		
		bookMap.put(1, book1);
		bookMap.put(2, book2);
		//4. 通过某一个编号获取Book对象，并打印该Book对象的标题 
		System.out.println(bookMap.get(1));
		System.out.println(bookMap.get(2));
		
		
	}
}
