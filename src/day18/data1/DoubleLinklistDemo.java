package day18.data1;


//节点类
class Node{
	//节点
	Node pre;//上个节点
	Node next;//下个节点
	//数据部分
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
		System.out.println("name:"+name+"\t\tage:"+age);
		return super.toString();
	}
}
public class DoubleLinklistDemo {
	//操作双链表
	//头部节点
	Node head;
	//尾部节点
	Node foot;

	//添加节点  尾部
	public void addLast(Node node) {
		//找尾部
		if (foot==null) {
			head=node;
			foot=node;
			return;
		}
		//赋值
		foot.next=node;
		node.pre=foot;
		//foot指向最新的节点
		foot=node;
	}
	//在头部添加
	public void addFirst(Node node) {
		//判断head是否为空
		if (head==null) {
			head=node;
			foot=node;
			return;
		}
		//赋值
		node.next=head;
		head.pre=node;
		head=node;
	}
	//在指定位置添加
	public void addNode(Node node,String name) {
		Node tmp=head;
		while (tmp!=null) {
			
			if (tmp.name.equals(name)) {
				node.next=tmp.next;
				tmp.next=node;
				//node.pre=tmp;
			}
			tmp=tmp.next;
		}
	}
	//打印所有信息
	public void list() {
		//遍历
		Node node=head;
		while (node!=null) {
			node.toString();
			node=node.next;
		}
	}
	public static void main(String[] args) {
		// 初始化对象
		DoubleLinklistDemo demo=new DoubleLinklistDemo();
		//在头部添加节点对象
		System.out.println("-----在头部添加------");
		demo.addFirst(new Node("葬剑灬尊",21));
		demo.addFirst(new Node("浪子一秋",21));
		demo.addFirst(new Node("一叶知秋",21));
		demo.addFirst(new Node("剑侠情缘",21));
		//打印节点
		demo.list();
		//在尾部添加
		System.out.println("--------在尾部添加----------");
		demo.addLast(new Node("秦时明月",22));
		demo.addLast(new Node("天行九歌",22));
		demo.addLast(new Node("夜尽天明",22));
		demo.list();
		System.out.println("-------在指定位置添加-------");
		demo.addNode(new Node("诸子百家",12), "天行九歌");
		demo.list();
	}

}
