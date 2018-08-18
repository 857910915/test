package day25.singleton;

public class TestDemo {
	public static void main(String[] args) {
		/*SingletonDemo demo=SingletonDemo.getIntance();
		demo.name="zz";
		System.out.println(demo);
		SingletonDemo demo1=SingletonDemo.getIntance();
		System.out.println(demo1);
		System.out.println(demo1.name);*/

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo.getIntance());
			}
		}).start();;

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo.getIntance());
			}
		}).start();;

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo.getIntance());
			}
		}).start();;

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo.getIntance());
			}
		}).start();;

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo.getIntance());
			}
		}).start();;
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo.getIntance());
			}
		}).start();;
	}
}
