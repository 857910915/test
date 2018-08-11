package day20.test;
class Node{
	Node next;
	String name;
	public Node(){
	}
	public Node(String name){
		this.name=name;
	}
}
public class Linkeddemo{
	Node head=null;
	//添加
	public void addNode(Node node){
		if(head==null){
			head=node;
			return;
		}
		Node tmp=head;
		Node pre=null;
		while(tmp!=null){
			pre=tmp;
			tmp=tmp.next;
		}
		pre.next=node;
	}
	//删除
	public void deleteNode(String name){
		Node tmp=head;
		Node pre=null;
		while(tmp!=null){
			if(tmp.name.equals(name)){
				if(tmp==head){
					head=head.next;
					return;
				}
				pre.next=tmp.next;
			}
			pre=tmp;
			tmp=tmp.next;
		}
	}
	//遍历
	public void list(){
		Node tmp=head;
		while(tmp!=null){
			System.out.print(tmp.name+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}
	public static void main(String[]args){
		Linkeddemo demo=new Linkeddemo();
		demo.addNode(new Node("aaa"));
		demo.addNode(new Node("a1a"));
		demo.addNode(new Node("ada"));
		demo.addNode(new Node("fva"));
		demo.list();
		demo.deleteNode("a1a");
		demo.list();
	}
}