package com.eric.jvm.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用jdk/bin目录下的jConsole工具观察内存变化
 * @author pxl
 *
 */
public class JConsole {
	
//	private byte[] b = new byte[128 * 1024];//成员变量不会被回收
	
	public JConsole() {
		byte[] b = new byte[128 * 1024];//局部变量长时间不使用则会被回收
	}
	
	public static void main(String[] args) {
		try {
			Thread.sleep(500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("started...");
		fill(1000);
	}

	private static void fill(int n) {
		List<JConsole> list = new ArrayList<JConsole>();
		for(int i = 0; i < n; i++) {
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.add(new JConsole());
		}
	}
	
}
