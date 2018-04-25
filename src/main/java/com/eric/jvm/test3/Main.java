package com.eric.jvm.test3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * jdk8 lambda表达式代替匿名内部类
 * @author pxl
 *
 */
public class Main extends JFrame{
	
	private JButton jb;
	
	public Main() {
		this.setBounds(200, 200, 400, 200);
		this.setTitle("lambda test");
		jb = new JButton("click me!");
//		jb.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("click me!");
//			}
//		});
		jb.addActionListener(event -> System.out.println("click me!"));
		this.add(jb);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
	}
}
