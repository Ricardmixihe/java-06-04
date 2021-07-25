package com.jizhong.pojo;
/**
 * 电影类：电影id 电影名称 电影定价
 */
public class Movie {
	private int id;//电影id 
	private String movieName;//电影名称 
	private double price;//电影定价
	
	//有参构造方法
	public Movie(int id, String movieName, double price) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.price = price;
	}

	//获取对象属性值
	public String getMovieName() {
		return movieName;
	}

	//以字符串格式打印对象
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", price=" + price + "]";
	}

	//设置对象属性值
//	public void setMovieName(String movieName) {
//		this.movieName = movieName;
//	}
	
	
	
	
}
