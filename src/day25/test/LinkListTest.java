package day25.test;
//单链表练习

//节点类
class Node{
	//节点
	
	Node next;
	//属性
	String name;
	int age;
	public Node() {
		// TODO 自动生成的构造函数存根
	}
	public Node(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		System.out.println("name:"+this.name+"\t\tage:"+this.age);
		return super.toString();
	}
}
public class LinkListTest {
	//节点
	//Node node;
	Node head;
	//添加节点
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
	
	//删除节点
	public void deleteNode(String name) {
		Node tmp=head;
		Node pre=null;
		while (tmp!=null) {
			if (tmp.name.equals(name)) {
				if (tmp==head) {
					head=head.next;
				}else {
					pre.next=tmp.next;
				}
			}
			pre=tmp;
			tmp=tmp.next;
		}
	}
	//在任意位置添加
	public void addByName(Node node,String name) {
		if (head==null) {
			//将头部指向node
			head=node;
			return;
		}
		Node tmp=head;
		while (tmp!=null) {
			if (tmp.name.equals(name)) {
				node.next=tmp.next;
				tmp.next=node;
			}
			tmp=tmp.next;
		}
	}
	
	//遍历节点
	public void list() {
		Node tmp=head;
		while (tmp!=null) {
			tmp.toString();
			tmp=tmp.next;
		}
	}
	public static void main(String[] args) {
		// 初始化对象
		LinkListTest demo=new LinkListTest();
		demo.addNode(new Node("asd",22));
		demo.addNode(new Node("qaz",21));
		demo.addNode(new Node("wfd",22));
		demo.addNode(new Node("qmn",21));
		
		demo.addByName(new Node("adx",23), "asd");
		demo.list();
		System.out.println("delete----------------");
		demo.deleteNode("asd");
		demo.deleteNode("wfd");
		demo.list();
	}

}
