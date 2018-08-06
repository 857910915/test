package day10.Test2;
//测试类
public class TestDemo {
	//将父类作为返回值返回
	public static Goods getType(int type) {
		if (type==1) {
			//初始化TVs对象
			TVs tv=new TVs("TCL",3999);
			return tv;
		}else if(type==2){
			Foods food=new Foods("方便面",5);		
			return food;
		}
		return null;		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		getType(1).print();
		getType(2).print();
	}

}
