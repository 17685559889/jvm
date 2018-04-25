package com.eric.jvm.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟堆内存溢出
 * 
 * @author pxl
 *
 */
public class Main {

	public static void main(String[] args) {
		
		/**
		 * VM arguments:
		 * -Xms40m -Xmx40m 
		 * -XX:+HeapDumpOnOutOfMemoryError 保存堆内存溢出快照
		 * 通过Eclipse Memory Analyzer分析快照信息	
		 */
		List<Demo> list = new ArrayList<Demo>();
		while (true) {
			list.add(new Demo());
		}
		
	}
}
