package day22.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Administrator\\Desktop");
		printAllFileInfo(file);
		//对文件后缀名为txt的文件进行显示输出
		System.out.println("-------------------------");
		/*File []file4=File.listRoots();
		for (File file2 : file4) {
			printTxt(file2);
		}*/
		printTxt(file);
		//批量修改文件名称
		/*System.out.println("---------------------------");
		File file1=new File("C:\\Users\\Administrator\\Desktop\\test\\one");
		file1.mkdirs();
		if (file1.isDirectory()&&file1.exists()) {
			file1=new File(file1.getAbsoluteFile(),"123.java");
			file1.createNewFile();
			file1=new File(file1.getParent(),"123.txt");
			file1.createNewFile();
		}
		File file2=new File("C:\\Users\\Administrator\\Desktop\\test\\two");
		file2.mkdirs();
		if (file2.isDirectory()&&file2.exists()) {
			file2=new File(file2.getAbsoluteFile(),"123.java");
			file2.createNewFile();
			file2=new File(file2.getParent(),"123.txt");
			file2.createNewFile();
		}*/
		//创建文件夹和文件
		File file3=new File("C:\\Users\\Administrator\\Desktop\\test");
		editManyName(file3);
	}
	//列出当前目录下的所有文件和子目录文件
	public static void printAllFileInfo(File file) {
		if (file.isDirectory()) {
			File []lists=file.listFiles();
			if (lists==null) {
				return;
			}
			for (File file1 : lists) {
				printAllFileInfo(file1);
			}
		}else {
			System.out.println(file.getName());
		}
	}
	//对文件后缀名为txt的文件进行显示输出
	public static void printTxt(File file) {
		if (file.isDirectory()) {
			File []lists=file.listFiles();
			if (lists==null) {
				return;
			}
			for (File file2 : lists) {
				printTxt(file2);
			}
		}else {
			if (file.getName().endsWith(".txt")) {
				System.out.println(file.getName());
			}
			/*String regex="\\w+.txt";
			boolean r=file.getName().matches(regex);
			if(r) {
				System.out.println(file.getName());
			}*/
		}
	}
	//批量修改文件名称
	public static void editManyName(File file) {
		if (file.isDirectory()) {
			File []lists=file.listFiles();
			if (lists==null) {
				return;
			}
			for (File file2 : lists) {
				editManyName(file2);
			}
		}else {
			
			if (file.getName().matches("\\d+.txt")) {
				file.renameTo(new File(file.getParent(), "456.txt"));
			}else {
				file.renameTo(new File(file.getParent(),"456.java"));
			}
		}
	}
}
