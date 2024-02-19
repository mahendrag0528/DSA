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

public class CircularLL{
	Node head;
	Node tail;
	int l;
	CircularLL(){
		this.head=null;
		this.tail=null;
		this.l=0;
	}
	
	//add elements
	public void add(int data){
		Node x=new Node(data);
		if(head==null){
			head=x;
			tail=head;
			tail.next=head;
		}
		else{
			tail.next=x;
			tail=x;
			tail.next=head;
		}
		l++;
	}
	
	//retrive
	public void print(){
		Node x=head;
		if(head==null)return;
		while(x.next!=head){
			System.out.print(x.data+"-->");
			x=x.next;
		}
		System.out.print(x.data+"-->"+x.next.data);
	}
	
	//insert into CircularLL
	
	public void insert(int data,int n){
		int c=1;
		Node in=new Node(data);
		Node x=head;
		Node pre=head;
		if(head==null){
			head=in;
			tail=head;
			tail.next=head;
			return;
		}
		if(n==1){
			in.next=x;;
			head=in;
			tail.next=head;
		}
		while(c<n){
			pre=x;
			x=x.next;
			c++;
		}
		pre.next=in;
		in.next=x;
		if(in.next==head){
			tail=in;
		}
		l++;
	}
	
	//delete into circular LL
	
	public void delete(int n){
		if(head==null){
			System.out.println("Not passible");
			return;
		}
		int c=1;
		if(n%l==1)
		{
			if(head.next==head){
				head=tail=null;
			}
			else{
				head=head.next;
				tail.next=head;
			}
		}
		else{
			Node x=head;
			Node pre=null;
			while(c<n){
				pre=x;
				x=x.next;
				c++;
			}
			if(x.next!=head)
			pre.next=x.next;
		else{
			pre.next=x.next;
			tail=pre;
		}
		}
		l--;
	}
	
	public static void main(String[] args){
		CircularLL obj=new CircularLL();
		obj.insert(6,1);
		obj.insert(67,1);
		obj.add(66);
		obj.insert(60,100);
		obj.print();
		obj.delete(1);
		obj.print();
	}
}