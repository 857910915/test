package day10.Test1;

public class Penguin extends Pet{
	@Override
	public void eatFoods() {
		// TODO 自动生成的方法存根
		System.out.println("企鹅饿了，要吃小鱼");
	}
	public void food() {
		int i=0;
		while(this.getHealth()<100){
			this.setHealth(getHealth()+5);
			if (this.getHealth()>100) {
				this.setHealth(100);
			}
			i++;
		}
		System.out.println("企鹅吃了"+i+"个小鱼头之后，健康值为"+this.getHealth());
	}
	//构造方法
	public Penguin() {
		// TODO 自动生成的构造函数存根
	}
	public  Penguin(int health) {
		this.setHealth(health);
	}
}
