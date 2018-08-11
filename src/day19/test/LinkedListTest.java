package day19.test;
//单链表练习
//节点类
class Node{
	//节点
	Node next;
	//属性
	String name;
	//构造方法
	public Node() {
		// TODO 自动生成的构造函数存根
	}
	public  Node(String name) {
		this.name=name;
	}
	
}
public class LinkedListTest {
	Node head=null;
	//添加
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
					return;
				}else {
					pre.next=tmp.next;
				}				
			}
			pre=tmp;
			tmp=tmp.next;
		}
	}
	//在任意位置添加
	public void addNodeByName(String name,Node node) {
		Node tmp=head;
		while (tmp!=null) {
			if (tmp.name.equals(name)) {				
				node.next=tmp.next;
				tmp.next=node;
			}
			tmp=tmp.next;
		}
	}
	//遍历输出
	public void list() {
		Node tmp=head;
		while (tmp!=null) {
			System.out.println(tmp.name);
			tmp=tmp.next;
		}
	}
	
	public static void main(String[] args) {
		//初始化对象
		LinkedListTest demo=new LinkedListTest();
		demo.addNode(new Node("尊"));
		demo.addNode(new Node("aa"));
		demo.addNode(new Node("a1a"));
		demo.addNode(new Node("aa1"));
		demo.addNodeByName("尊", new Node("浪子"));
		demo.addNodeByName("aa", new Node("qqq"));
		demo.list();
		System.out.println("删除----------");
		demo.deleteNode("尊");
		demo.deleteNode("aa");
		demo.list();
	}
}
