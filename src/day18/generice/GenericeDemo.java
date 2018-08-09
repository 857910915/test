package day18.generice;
/*
 * 多个泛型
 * */
public class GenericeDemo <T,E>{
	T key;
	E value;
	public static void main(String[] args) {
		//初始化对象
		GenericeDemo<String, Integer> demo=new GenericeDemo<String, Integer>();
		//赋值
		demo.key="zzz";
		demo.value=111;
		//取值
		System.out.println(demo.key+"\t"+demo.value);
	}
}
