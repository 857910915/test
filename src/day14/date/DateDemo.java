package day14.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		/**
		 * Date是一个日期类
		 * 		在类中可以获得当前系统时间
		 * 		获取当前的时间戳，以毫秒为单位，开始时间：1970 01-01 00：00：00
		 * 
		 * */
		//1.初始化一个date对象
		Date d=new Date();
		//2.打印当前时间,默认的时间格式
		System.out.println(d.toString());
		//3.获取当前时间戳
		long l=d.getTime();
		System.out.println(l);
		//4.通过时间戳创建对象
		Date d1=new Date(1533613377168L);
		System.out.println(d1.toString());
		//5.获取一个日期格式化对象
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);//默认系统的格式
		System.out.println(df.format(d1));//将时间转换成规定格式类型
		df=DateFormat.getTimeInstance(DateFormat.FULL);//只转换时间
		System.out.println(df.format(d1));
		//日期时间
		df=DateFormat.getDateTimeInstance();
		System.out.println(df.format(d1));
		//自定义时间格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS E G Z");
		//将日期转换成固定格式  日期===》文本
		String time=sdf.format(d);
		System.out.println(time);
		//将文本还原成日期对象
		d=sdf.parse(time);
		System.out.println("解析后的时间："+d);
	}
}
