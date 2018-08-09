package day18.generice;
//泛型通配符
public class GenericeDemo2 <T extends Number>{
	//T 只能是数字类型
	
	public static void main(String[] args) {
		//初始化一个对象
		GenericeDemo2<Integer> demo=new GenericeDemo2<Integer>();		
	}
}
