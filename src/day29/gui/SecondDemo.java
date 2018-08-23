package day29.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SecondDemo {

	public static void main(String[] args) {
		// 1.创建一个主窗体
		JFrame mainFrame=new JFrame("第二个窗体");
		mainFrame.setBounds(500, 300, 250, 300);
		//清空主窗体默认的布局方式
		mainFrame.setLayout(null);
		//创建输入框
		JTextField tf=new JTextField();
		//输入默认显示的内容
		tf.setText("我是输入框");
		//设置文本框
		tf.setBounds(0, 0, 100, 40);
		//添加到主窗体
		mainFrame.getContentPane().add(tf);
		//添加按钮
		JButton btn=new JButton("保存");
		btn.setBounds(100, 200, 70, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				
			}
		});
		mainFrame.add(btn);
		//显示主窗体
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}

}
