package day14.calendar;

import java.util.Date;
import java.util.Calendar;

public class CalendarDemo {
	/**
	 * Calendar
	 * 		代替date
	 * 		1.获取时间个体（failed）
	 * 		2.设置时间（faile）
	 * */
	public static void main(String[] args) {
		//获取一个日历对象
		Calendar c=Calendar.getInstance();
		//将日历对象转换成date
		Date d=c.getTime();
		System.out.println(d);
		//将日历转换成时间戳
		long l=c.getTimeInMillis();
		System.out.println(l);
		//获取日历的时间
		System.out.println(c.get(Calendar.YEAR));//获取年
		System.out.println(c.get(Calendar.MONTH));//获取月份，从0开始
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//这个月的第几天
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//这周的第几天,美国时间
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//默认一号为一周的第一天
		System.out.println(c.get(Calendar.AM_PM));//上午是0，下午是1
		System.out.println(c.get(Calendar.DATE));//获取当前是这个月的第几天
		System.out.println(c.get(Calendar.HOUR_OF_DAY));//获取24 小时的时间
		System.out.println(c.get(Calendar.HOUR));//12 小时制
		System.out.println(c.get(Calendar.MINUTE));//获取分
		System.out.println(c.get(Calendar.SECOND));//获取秒
		System.out.println(c.get(Calendar.MILLISECOND));//获取毫秒
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));//这个月的第几周
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));//这年的第几周
		System.out.println(c.get(Calendar.DAY_OF_YEAR));//这年的第几天
		
		//使用字段设置时间
		c.set(Calendar.AM_PM,Calendar.AM);
		c.setTime(new Date());//将date转换成日历
		System.out.println(c.get(Calendar.AM_PM));
		c.setTimeInMillis(l);//将时间戳转换成日历
		System.out.println(c.getTime());
	}
}
