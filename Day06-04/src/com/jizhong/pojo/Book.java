package com.jizhong.pojo;
/**
 	1. 创建一个类Book 
	2. 包含属性：title（标题），使用构造方法进行初始化 
	3. 重写toString()方法，用以返回title属性的值 
 */
public class Book {
	private String title;//标题
	
	public Book(String title){
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
}
