package day18.test1;
//双链表练习
//节点类
class Node{
	//节点
	Node pre;
	Node next;
	//数据
	String name;
	public Node() {
		// TODO 自动生成的构造函数存根
	}
	public  Node(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		System.out.println("name:"+this.name);
		return super.toString();
	}
}

public class TestDemo {
	Node head;
	Node foot;
	//添加  从头部添加	
	public void addHead(Node node) {
		if (head==null) {
			head=node;
			foot=node;
			return;
		}
		node.next=head;
		head.pre=node;
		head=node;
	}
	//添加  从尾部添加
	public void addFoot(Node node) {
		if (foot==null) {
			foot=node;
			head=node;
			return;
		}
		foot.next=node;
		node.pre=foot;
		foot=node;
	}
	//删除  从头部
	public void deleteHead() {
		head=head.next;
		head.pre=null;
	}
	//从尾部删除
	public void deleteFoot() {
		foot=foot.pre;
		foot.next=null;
	}
	//查看
	public void list() {
		Node tmp=head;
		while (tmp!=null) {
			tmp.toString();
			tmp=tmp.next;
		}
	}
	public static void main(String[] args) {
		//初始化对象
		TestDemo demo=new TestDemo();
		//从头部添加
		demo.addHead(new Node("zsx"));
		demo.addHead(new Node("zsw"));
		demo.addHead(new Node("zvx"));
		demo.addHead(new Node("zdv"));
		//从尾部添加
		demo.addFoot(new Node("qaz"));		
		demo.list();
		
		demo.deleteHead();
		demo.deleteFoot();
		System.out.println("删除------------");
		demo.list();
		
	}
	
	
}
