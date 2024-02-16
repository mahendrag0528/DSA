/***** Linked list Implemntation ****/
import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class SingleLL{
	Node head;
	Node tail;
	SingleLL(){
		this.head=null;
		this.tail=null;
	}
	void add(int data){
		Node x=new Node(data);
		if(head==null){
			head=x;
			tail=x;
		}
		else{
			tail.next=x;
			tail=x;
		}
	}
	void print(){
		Node x=head;
		while(x!=null){
			System.out.print(x.data+"-->");
			x=x.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args){
		SingleLL obj=new SingleLL();
		obj.print();
		obj.add(4);
		obj.add(6);
		obj.add(6);
		obj.print();
	}
}
	