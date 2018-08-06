package day10.Test1;
//子类
public class Dog extends Pet{
	@Override
	public void eatFoods() {
		// TODO 自动生成的方法存根
		System.out.println("狗狗饿了，要吃大骨头");
	}
	public void food() {
		int i=0;
		while(this.getHealth()<100){
			this.setHealth(getHealth()+3);
			if (this.getHealth()>100) {
				this.setHealth(100);
			}
			i++;
		}
		System.out.println("小狗吃了"+i+"个骨头之后，健康值为"+this.getHealth());	
	}
	//构造方法
	public Dog() {
		// TODO 自动生成的构造函数存根
	}
	public Dog(int health) {
		this.setHealth(health);
	}
}
