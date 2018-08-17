package day25.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{
	@Override
	public void run() {
		// 计时器要执行的任务
		System.out.println("上九天揽月，下五洋捉鳖！");		
	}
}

public class TimerDemo {

	public static void main(String[] args) throws ParseException {
		// 创建一个计时器对象，可以设置为守护线程+true
		Timer timer=new Timer();
		//添加执行的任务
		//获取当前时间戳
		Calendar c=Calendar.getInstance();
		Long times=c.getTimeInMillis();
		//3s后执行
		times+=3*1000;
		//设置时间
		c.setTimeInMillis(times);
		//获取日期
		Date date=c.getTime();
		//指定时间
		SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//将String类型的时间解析为Date
		date=frm.parse("2018-08-17 16:39:40");
		Task ts=new Task();
		timer.schedule(new Task(), date);//在指定的时间来执行指定的任务
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// 执行任务
				System.out.println("送你一颗小星星");			
			}
		}, 5000);//以当前时间延迟多少毫秒执行一次任务
		
		//指定首次出现时间
		date=frm.parse("2018-08-17 16:45:00");
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("我不要！");
			}
		}, date, 10000);//在指定的时间执行任务，以一定的延时重复执行
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("那就分手吧！");
			}
		}, 2000, 5000);//以当前时间延迟多少s，再以固定的时间重复执行
		
		//取消指定任务
		//ts.cancel();
		//取消timer内所有任务
		//ts.cancel();
		//清空已结束任务
		System.out.println(timer.purge());
	}
}
