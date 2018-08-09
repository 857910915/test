package day18.data3;
//单链表实现栈
class Node{
	//节点
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
public class StackDemo {
	/**
	 * 栈的特点  先进先出  FILO
	 * 放数据：压栈
	 * 取数据：出栈
	 * */
	Node head;//头结点
	//压栈
	public void push(Node node) {
		//每次将数据设为头结点
		//让node的下个节点指向于head
		node.next=head;
		//把node的引用赋值给head
		head=node;
	}
	//出栈
	public void pop() {
		//删除头结点
		//找到头结点的下个节点赋值给node
		Node node=head.next;
		head=node;
		//等价于
		//head=head.next;
	}
	//查看所有元素
	public void list() {
		//从头到尾
		Node node=head;
		while (node!=null) {
			node.toString();
			node=node.next;
		}
	}
	
	//入口方法
	public static void main(String[] args) {
		//初始化对象
		StackDemo demo=new StackDemo();
		//压栈
		demo.push(new Node("阿里"));
		demo.push(new Node("腾讯"));
		demo.push(new Node("京东"));
		demo.push(new Node("百度"));
		demo.list();
		//出栈
		System.out.println("--------出栈-------");
		demo.pop();
		demo.list();
	}
}
