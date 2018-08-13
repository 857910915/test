package day21.test;
//单节点练习
//节点类
class Node{
	//节点
	Node next;
	//属性
	String name;
	//构造方法
	public Node() {
		
	}
	public  Node(String name) {
		this.name=name;		
	}
	@Override
	public String toString() {
		System.out.println("name=="+name);
		return super.toString();
	}
}
public class LinkedListDemo {
	//属性
	Node head=null;
	//添加节点，从头部添加
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
					return;
				}
				pre.next=tmp.next;
			}
			pre=tmp;
			tmp=tmp.next;
		}
	}
	//在中间添加
	public void addNodeByName(Node node,String name) {
		if (head==null) {
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
	
	
	//入口方法
	public static void main(String[] args) {
		//初始化对象
		LinkedListDemo demo=new LinkedListDemo();
		//添加
		demo.addNode(new Node("随波逐流"));
		demo.addNode(new Node("捷足先登"));
		demo.addNode(new Node("无所畏惧"));
		demo.addNode(new Node("同流合污"));
		demo.addNode(new Node("诗和远方"));
		demo.list();
		System.out.println("删除-----------");
		demo.deleteNode("诗和远方");
		demo.deleteNode("随波逐流");
		demo.list();
		System.out.println("任意添加--------");
		demo.addNodeByName(new Node("大同小异"), "捷足先登");
		demo.addNodeByName(new Node("大道无形"), "无所畏惧");
		demo.list();
	}
}
