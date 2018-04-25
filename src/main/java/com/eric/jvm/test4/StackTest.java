package com.eric.jvm.test4;

/**
 * 栈溢出模拟
 * @author pxl
 *
 */
public class StackTest {

	private void test() {
		System.out.println("方法执行...");
		test();
	}
	
	public static void main(String[] args) {
		new StackTest().test();;
	}
}
