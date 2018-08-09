package day18.data2;


//声明一个节点类
class Node{
	//节点
	Node pre;//上
	Node next;//下
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
public class QueueDemo {
	/**
	 * 队列：先进先出  FIFO
	 * 对数据增加删除居多
	 * 底层的数据存储使用链表最合适
	 * */
	
	//声明一个头部节点和尾部节点
	Node head;
	Node foot;
	//在队列的头部添加节点
	public void pushFirst(Node node) {
		if (head==null) {
			head=node;
			foot=node;
			return;
		}
		node.next=head;
		head.pre=node;
		head=node;
	}
	//在队列的尾部添加节点
	public void pushLast(Node node) {
		//判断尾部节点是否为null
		if (foot==null) {
			foot=node;
			head=node;
			return;
		}
		//在尾部添加节点
		foot.next=node;
		node.pre=foot;
		//尾部指向最新的
		foot=node;
	}
	//在队列的首部删除一个节点
	public void popFirst() {
		//删除首部节点
		head=head.next;
		head.pre=null;
	}
	//在队列的尾部删除一个节点
	public void popLast() {
		Node node=foot.pre;
		foot.next=null;
		foot=node;
	}
	//查看队列中所有元素
	public void list() {
		//遍历节点  从头到尾
		Node node=head;
		//判断node是否为null
		while (node!=null) {
			node.toString();
			node=node.next;			
		}
	}
	public static void main(String[] args) {
		//初始化对象
		QueueDemo demo=new QueueDemo();
		//添加数据
		demo.pushLast(new Node("浪子一秋"));
		demo.pushLast(new Node("一叶知秋"));
		demo.pushLast(new Node("葬剑灬尊"));
		demo.pushLast(new Node("秦时明月"));
		demo.pushLast(new Node("天行九歌"));
		
		demo.pushLast(new Node("三生三世"));
		demo.list();
		//删除
		demo.popFirst();
		demo.popLast();
		System.out.println("-----------删除------------");
		demo.list();
	}
}
