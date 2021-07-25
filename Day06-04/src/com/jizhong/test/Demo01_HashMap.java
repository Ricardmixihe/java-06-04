package com.jizhong.test;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jizhong.pojo.Movie;

public class Demo01_HashMap {
	public static void main(String[] args) {
		//1. 创建电影数据
		//1.1 科幻电影数据
		Movie kh1 = new Movie(1, "阿凡达", 50);
		Movie kh2 = new Movie(2, "暮光之城", 50);
		//1.2 恐怖电影数据
		Movie kb1 = new Movie(3, "贞子缠身", 50);
		Movie kb2 = new Movie(4, "咒怨", 50);
		
		//2. 创建存储电影数据的集合
		//2.1 创建存储科幻电影集合
		List<Movie> khList = new ArrayList<>();
		khList.add(kh1);
		khList.add(kh2);
		//2.2 创建存储恐怖电影集合
		List<Movie> kbList = new ArrayList<>();
		kbList.add(kb1);
		kbList.add(kb2);
		
		//3. 创建HashMap集合
		//Key：电影分类    value：电影DVD集合
		Map<String, List<Movie>> movieMap = new HashMap<>();
		//3.1 使用HashMap的put方法进行存储
		//put(k,v)：添加数据到Map集合中，键值对方式
		movieMap.put("科幻电影", khList);
		movieMap.put("恐怖电影", kbList);
		
		//4. 分别打印键集、值集、以及键-值对集合
		//4.1 打印键集合
		//Map.keySet()：获取Map集合中所有的key值
		//Set集合：与ArrayList比较类似，但是不能存储重复的值
		//Map集合的key不可重复
		Set<String> keySet = movieMap.keySet();
		System.out.println("Key值为：" + keySet);
		//4.2 打印值集合
		//Map.values()：获取Map集合中的所有value值
		Collection<List<Movie>> values = movieMap.values();
		System.out.println("Value值为：" + values);
		//4.3 打印键值对集合
		//Map.get (Object key)：可以通过Map中的Key来获取对应的value值
		//List.toArray()：将一个集合转换成数组
		Object[] keyArr = keySet.toArray(); //object
		for(int i = 0;i < keyArr.length;i++){
			String key = (String)keyArr[i];
			List<Movie> value = movieMap.get(key);//获取key对应的value值
			System.out.println(key + "：" + value);
		}
		
		//5. 判断是否存在“科幻电影”键，如果是，则根据键获取相应的值get(key)
		//5.1  判断是否存在“科幻电影”键
		//Map.containsKey (Object key)：判断当前Map集合中是否包含key
		if (movieMap.containsKey("科幻电影")) {
			//5.2 根据键获取相应的值get(key)
			System.out.println("科幻电影：" + movieMap.get("科幻电影"));
		}
		
		//6. 根据键删除某条记录
		//Map.remove (Object key)：根据key来删除Map集合由key映射的key value键值对数据
		movieMap.remove("恐怖电影");
		if (movieMap.containsKey("恐怖电影")) {
			System.out.println("Map集合中还有恐怖电影");
		}else{
			System.out.println("Map集合中没有恐怖电影了~");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
