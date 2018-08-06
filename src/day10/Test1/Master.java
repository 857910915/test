package day10.Test1;

public class Master {
	//喂食
	public void feed(Pet pet) {
		pet.eatFoods();
		if (pet instanceof Dog) {
			Dog dog=(Dog)pet;
			dog.food();
		}else if (pet instanceof Penguin) {
			Penguin pen=(Penguin)pet;
			pen.food();
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化master对象
		Master mas=new Master();
		//初始化dog对象
		Dog dog=new Dog(89);
		Pet pet=dog;
		mas.feed(pet);
		Penguin pen=new Penguin(76);
		Pet pet1=pen;
		mas.feed(pet1);
	}
}
