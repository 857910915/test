package day23.test;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\Administrator\\Desktop\\Java1807");
		listAllFileInfo(file);
	}
	public static void listAllFileInfo(File file) {
		if (file.isDirectory()) {
			File[]lists=file.listFiles();
			if (lists==null) {
				return;
			}
			for (File file2 : lists) {
				listAllFileInfo(file2);
			}
		}else {
			if (file.getName().endsWith(".txt")) {
				System.out.println(file.getName());
			}		
		}
	}
}
