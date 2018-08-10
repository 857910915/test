package day18.test;
//单链表练习
//节点类
class Node{
	Node next;
	String name;
	int age;
	public Node() {
		// TODO 自动生成的构造函数存根
	}
	public  Node(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		System.out.println("name:"+name+"\t\tage"+age);
		return super.toString();
	}
}
public class TestDemo {
	//添加
	Node head;//声明一个头结点
	public void addNode(Node node) {		
		if (head==null) {
			head=node;
			return;
		}
		Node tmp=head;
		Node pre=null;
		while (tmp!=null) {
			pre=tmp;
			tmp=tmp.next;
		}
		pre.next=node;
	}
	//删除
	public void deleteNode(String name) {
		Node tmp=head;
		Node pre=null;
		while (tmp!=null) {
			if (tmp.name.equals(name)) {
				if (tmp==head) {
					head=head.next;
					break;
				}
				pre.next=tmp.next;
			}
			pre=tmp;
			tmp=tmp.next;
		}
	}
	//查看所有元素
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
		//添加
		demo.addNode(new Node("zzzz",11));
		demo.addNode(new Node("zxdc",12));
		demo.addNode(new Node("zaq",13));
		demo.addNode(new Node("qwe",21));
		//打印
		demo.list();
		demo.deleteNode("zzzz");
		System.out.println("删除----------");
		demo.list();
	}
}
