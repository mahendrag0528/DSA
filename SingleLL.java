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
	
	//insert at index start from 1
	void insert(int data,int index){
		Node x=new Node(data);
		int c=1;
		if(c==index){
			x.next=head;
			head=x;
		}
		else{
			Node cur=head;
			while(cur.next!=null && c<(index-1)){
				cur=cur.next;
				c++;
			}				
			x.next=cur.next;
			cur.next=x;
		}
	}
	
	void delete(int index){
		int c=1;
		Node x=head;
		if(index==1)
			head=head.next;
		while(x.next!=null && c<(index-1)){
			x=x.next;
			c++;
		}
		if(x.next==null)return;
		Node r=x.next;
		x.next=r.next;
	}
	
	public static void main(String[] args){
		SingleLL obj=new SingleLL();
		obj.print();
		obj.add(4);
		obj.add(69);
		obj.add(6);
		obj.print();
		obj.insert(3,5);
		obj.print();
		obj.delete(4);
		obj.print();
	}
}
	
