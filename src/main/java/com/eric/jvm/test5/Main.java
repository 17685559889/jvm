package com.eric.jvm.test5;

/**
 * 常量池
 * @author pxl
 *
 */
public class Main {
	
	public static void main(String[] args) {
		/**
		 * s1与s2指向的字符串abc存放于方法区常量池中的StringTable（HashSet）中，故s1==s2为true。 
		 * s3存放于堆内存中，故比较地址时不等于s1和s2。 
		 * intern方法是将堆内存中的字符串放入常量池。
		 */
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);//true
		String s3 = new String("abc");
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s3.intern());//true
	}
}
