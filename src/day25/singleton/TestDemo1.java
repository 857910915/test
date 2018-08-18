package day25.singleton;

public class TestDemo1 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo1.getIntance());
			}
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo1.getIntance());
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo1.getIntance());
			}
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo1.getIntance());
			}
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo1.getIntance());
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(SingletonDemo1.getIntance());
			}
		}).start();
	}
}
