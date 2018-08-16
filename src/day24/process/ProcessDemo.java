package day24.process;

import java.io.IOException;

/**
 * java中启动进程的两种方式
 * 		1.RunTime，运行时类
 * 		2.ProcessBuilder类
 * */
public class ProcessDemo {

	public static void main(String[] args) throws IOException {
		/*//1通过运行时类
		Runtime time=Runtime.getRuntime();
		//执行要打开的进程
		time.exec("notepad");
		time.exec("D:\\TSBrowserDownloads\\cmder\\Cmder.exe");
		*/
		//2通过进程生成器启动进程
		ProcessBuilder builder=new ProcessBuilder("notepad");
		//启动进程
		builder.start();
	}
}
