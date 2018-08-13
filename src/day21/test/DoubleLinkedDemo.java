package day21.test;
//双节点练习
//节点类
class Nodes{
	//节点
	Nodes pre;//上个节点
	Nodes next;//下个节点
	//属性
	String name;
	//构造方法
	public Nodes() {
		// TODO 自动生成的构造函数存根
	}
	public  Nodes(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		System.out.println("name=="+name);
		return super.toString();
	}
}
public class DoubleLinkedDemo {
	//属性
	Nodes head=null;
	Nodes foot=null;
	//添加
	public void addNodesByHead(Nodes node) {
		if (head==null) {
			head=node;
			foot=node;
			return;
		}
		node.next=head;
		head.pre=node;
		head=node;		
	}
	
	//遍历输出
	public void list() {
		Nodes tmp=head;
		while (tmp!=null) {
			tmp.toString();
			tmp=tmp.next;
		}
	}
	public static void main(String[] args) {
		DoubleLinkedDemo demo=new DoubleLinkedDemo();
		demo.addNodesByHead(new Nodes("九五之尊"));
		demo.addNodesByHead(new Nodes("帝豪"));
		demo.addNodesByHead(new Nodes("老道"));
		demo.addNodesByHead(new Nodes("芙蓉王"));
		demo.addNodesByHead(new Nodes("红旗渠"));
		demo.list();
	}
}
