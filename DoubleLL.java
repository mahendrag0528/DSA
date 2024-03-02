/* double linked List*/

class Node{
	int data;
	Node next;
	Node pre;
	Node(int data){
		this.data=data;
		this.next=null;
		this.pre=null;
	}
}
public class DoubleLL{
	Node head;
	Node tail;
	DoubleLL(){
		this.head=null;
		this.tail=null;
	}
	//add element to double ll
	public void add(int data){
		Node cur=new Node(data);
		if(head==null){
			head=cur;
			tail=cur;
		}
		else{
			tail.next=cur;
			cur.pre=tail;
			tail=cur;
		}
	}
	//retrive the elements in double ll
	public void print(){
		Node cur=head;
		System.out.println("Traversal from front");
		if(head==null){
			System.out.println("Empty list");
		}
		else{
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println("null");
		}
		System.out.println("Traversal from end");
		cur=tail;
		if(tail==null){
			System.out.println("Empty list");
		}
		else{
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.pre;
		}
		System.out.println("null");
		}
	}
	//insert into double ll
	public void insert(int data,int index){
		
	}
	//delete element at index
	public void delete(int index){
		
	}
	public static void main(String[] args){
		DoubleLL obj=new DoubleLL();
		obj.add(100);
		obj.add(12);
		obj.add(143);
		obj.print();
	}
}
