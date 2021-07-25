package com.jizhong.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.jizhong.pojo.Book;
/**
 * Iterator：迭代器
 * 	作用：遍历集合对象
 */
public class Demo02_Iterator {
	public static void main(String[] args) {
		//1. 准备数据
		Book b1 = new Book("java");
		Book b2 = new Book("c");
		//2. 将数据放入集合
//		List<Book> books = new ArrayList<>();//可以存储重复数据，有序（插入数据顺序）
		Set<Book> books = new HashSet<>();//不可以存储重复数据，无序（插入数据顺序）
		books.add(b1);
		books.add(b2);
		//3. 创建迭代器
		//List.iterator()：创建迭代器对象
		Iterator iterator = books.iterator();
		//4. 使用迭代器遍历集合
		//Iterator.hasNext()：判断是否还有下一个元素
		//Iterator.next()：获取下一元素，指针向后移一位
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
//		System.out.println(iterator.next());//book1
//		System.out.println(iterator.next());//book2
//		System.out.println(iterator.next());//book3
	}
}
