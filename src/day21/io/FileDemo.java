package day21.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//1.拼接字符串路径C:\\Users\\Administrator\\Desktop\\
		String path="我曾是少年.docx";
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
		System.out.println("判断文件是否存在："+file.exists());
		System.out.println("判断文件是否为绝对路径："+file.isAbsolute());
		System.out.println("判断文件是不是一个文件："+file.isFile());
		System.out.println("判断当前文件是否是隐藏文件："+file.isHidden());
		System.out.println("判断当前文件是否可执行："+file.canExecute());
		System.out.println("判断当前文件是否可读："+file.canRead());
		System.out.println("判断当前文件是否可写："+file.canWrite());
		System.out.println("抽象路径的哈希码："+file.hashCode());
		System.out.println("文件的上次修改时间："+file.lastModified());
		Date d=new Date(file.lastModified());
		System.out.println(d);		
		System.out.println("文件的大小"+file.length());
		//System.out.println(file.list());
		//文件重命名
		//file.renameTo(new File("名字.后缀名"));
		
		File file1=new File("C:\\Users\\Administrator\\Desktop");
		//创建目录
		//System.out.println(file1.mkdir());//只能创建当前目录，不能创建父目录
		//System.out.println(file.mkdirs());//创建当前目录的同时，如果父目录不存在，会创建父目录
		//列出当前系统盘符
		System.out.println("-------------------------");
		File[]roots=File.listRoots();
		for (File file2 : roots) {
			System.out.println(file2);
		}
		//列出所有的文件名
		System.out.println("------------------------------");
		if (file1.exists()&&file1.isDirectory()) {
			String[]name=file1.list();
			for (String string : name) {
				System.out.println(string);
			}
		}
		//列出所有的文件对象	
		System.out.println("-----------------------------------");
		if (file1.exists()&&file1.isDirectory()) {
			File[]result=file1.listFiles();
			for (File file2 : result) {
				System.out.println(file2);
			}			
		}
		//打印当前目录下所有层级的文件信息
		System.out.println("---------------------------------");
		listAllFileInfo(file);	
		/*System.out.println("删除-------------------");
		File file2=new File("C:\\Users\\Administrator\\Desktop\\111.txt");
		file2.createNewFile();//创建新的文件
		file2.delete();//立即删除
		file2.deleteOnExit();//当虚拟机停止后删除
*/	}
	//打印当前目录下所有层级的文件信息
	public static void listAllFileInfo(File file) {
		if (file.isDirectory()) {//测试此抽象路径名表示的文件是否为目录
			File[]files=file.listFiles();
			for (File file2 : files) {
				//递归
				listAllFileInfo(file2);
			}
		}else {
			System.out.println(file);
		}
	}
}
