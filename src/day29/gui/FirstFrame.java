package day29.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstFrame {

	public static void main(String[] args) {
		// 1.创建一个主窗体，是不可见的
		JFrame mainFrame=new JFrame("第一个窗体");
		//2.设置窗体大小
		mainFrame.setBounds(500, 300, 250, 300);
		//设置窗体背景颜色
		mainFrame.getContentPane().setBackground(Color.green);
		//3.添加控件
		//文本
		JLabel label1=new JLabel("我是一个Lable");
		//设置字体
		label1.setFont(new Font("隶书", Font.BOLD, 28));
		//设置字体背景颜色
		//label1.setBackground(Color.red);
		//设置字体颜色
		label1.setForeground(Color.blue);
		//设置lable的布局
		//label1.setHorizontalAlignment(JLabel.CENTER);//水平
		//label1.setVerticalAlignment(JLabel.BOTTOM);
		//文字相对图片布局
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		//绝对
		label1.setHorizontalAlignment(JLabel.CENTER);
		//图片
		//label1.setIcon(new ImageIcon("D:\\图库\\1.jpg"));	
		//将lable添加到主窗体
		mainFrame.getContentPane().add(label1);
		//button
		JButton btn=new JButton("点击");
		mainFrame.getContentPane().add(btn);
		//给按钮添加事件
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 处理事件
				System.out.println(e.getSource());
			}
		});
		
		//退出
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示主窗体
		mainFrame.setVisible(true);

	}

}
