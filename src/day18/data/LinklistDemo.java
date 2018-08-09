package day18.data;

//节点类
class Node{
	//指向下个节点的引用
	Node next;
	//数据部分
	String name;
	int age;
	//构造方法
	public Node() {
		// TODO 自动生成的构造函数存根
	}
	public  Node(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		System.out.println("姓名："+name+"\t\t年龄："+age);
		return super.toString();
	}
}
public class LinklistDemo {
	//操作链表  增删查改
	//声明一个头部节点
	Node head=null;
	//添加节点
	public void addNode(Node node) {
		//1.判断头部节点是否为空
		if (head==null) {
			//将头部指向node
			head=node;
			return;
		}
		//2.判断判断节点的下个节点是否为空
		Node tmp=head;//把head赋值给一个临时变量
		Node pre=null;//记录上个节点
		while (tmp!=null) {
			pre=tmp;
			//遍历下个节点
			tmp=tmp.next;
		}		
		//如果为空，把最新的节点赋值给当前node的下个节点
		pre.next=node;
	}
	//删除节点
	public void deleteNode(String name) {
		//将头部节点赋值给tmp
		Node tmp=head;
		//声明上个节点
		Node pre=null;
		//判断节点是否为空
		while (tmp!=null) {
			//当前节点是否是要删除的节点
			if (tmp.name.equals(name)) {
				//删除节点
				//判断要删除的是否为第一个节点
				if (tmp==head) {
					head=head.next;
					break;
				}
				//不是头部节点
				pre.next=tmp.next;
			}
			//不是要删除的节点
			pre=tmp;
			tmp=tmp.next;
		}
	}
	//查询  通过内容查询索引
	public int queryNodeByName(String name) {
		Node tmp=head;
		//遍历节点
		int index=0;
		while (tmp!=null) {
			index++;
			if (tmp.name.equals(name)) {
				return index;
			}
			tmp=tmp.next;			
		}
		return -1;
	}
	//修改
	public void editNode(String name,int age) {
		Node tmp=head;
		while (tmp!=null) {
			if (tmp.name.equals(name)) {
				tmp.age=age;
			}
			tmp=tmp.next;
		}
	}
	
	//在指定位置添加node
	public void insertNode(String name,Node node) {
		if (head==null) {
			//将头部指向node
			head=node;
			return;
		}
		Node tmp=head;
		//遍历数组找到指定元素
		while (tmp!=null) {			
						
			if (tmp.name.equals(name)) {		
				node.next=tmp.next;
				tmp.next=node;				
			}
			
			tmp=tmp.next;
		}
	}
	//查看所有节点
	public void list() {
		//遍历所有节点  从头开始
		//把head赋值给一个临时变量
		Node tmp=head;
		//判断节点是否为空
		while (tmp!=null) {
			tmp.toString();//打印数据
			tmp=tmp.next;
		}
	}
	
	
	public static void main(String[] args) {
		//初始化对象
		LinklistDemo demo=new LinklistDemo();
		//添加节点对象
		demo.addNode(new Node("葬剑灬尊",21));
		demo.addNode(new Node("浪子一秋",21));
		demo.addNode(new Node("一叶知秋",21));
		demo.addNode(new Node("剑侠情缘",21));
		//打印节点
		demo.list();
		//删除节点
		System.out.println("-----------删除-----------");
		demo.deleteNode("葬剑灬尊");
		demo.list();
		//查询
		System.out.println("--------查询----------");
		int index=demo.queryNodeByName("剑侠情缘");
		System.out.println(index);
		//修改信息
		System.out.println("--------修改------------");
		demo.editNode("浪子一秋", 22);
		demo.list();		
		//添加
		System.out.println("---------添加----------");
		demo.insertNode("浪子一秋",new Node("吠舞罗",21));
		demo.list();
	}
}
