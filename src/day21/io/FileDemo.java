package day21.io;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//1.拼接字符串路径
		String path="C:\\Users\\Administrator\\Desktop\\我曾是少年.docx";
		//2.将字符串路径转换成File对象
		File file=new File(path);
		//File file1=new File("C:\\Users\\Administrator\\Desktop", "我曾是少年.docx");
		//File file2=new File(new File("C:\\Users\\Administrator\\Desktop"), "我曾是少年.docx");
		//3.读取文件属性信息
		//读取文件名称
		System.out.println("文件名称："+file.getName());
		//获取文件绝对路径、相对路径
		System.out.println("绝对路径："+file.getAbsolutePath());
		System.out.println("相对路径："+file.getPath());
		System.out.println("父目录："+file.getParent());
		System.out.println("文件分区大小："+file.getTotalSpace());//返回的是字节
		System.out.println("所在空间可用空间："+file.getFreeSpace());
		System.out.println("判断文件是否为绝对路径："+file.isAbsolute());
		System.out.println("判断文件是不是一个文件："+file.isFile());
		System.out.println("抽象路径的哈希码："+file.hashCode());
		System.out.println("文件的上次修改时间："+file.lastModified());
		System.out.println("文件的长度"+file.length());
		//System.out.println(file.list());
		System.out.println("判断文件是否存在："+file.exists());
		//列出所有的文件名
		
	
		//列出所有的文件对象
		
		
	}
}
