package com.example1;
import java.util.HashMap;
import java.util.Scanner;
public class linkedCircle {

		public static class linkeddsa {
		  static Node head;
		  static Node tail;
		  
		  class Node
		  {
		   int data;
		   Node next;
		   Node(int data)
		   {
		    this.data=data;
		   }
		   }
		  public void addlast(int data) 
		  {
		  Node newnode= new Node(data);
		  if(head==null)
		  {
		   head=newnode;
		   return ; 
		   }
		  
		  Node curr=head;
		  while(curr.next!=null)
		  {
		   curr=curr.next;
		  }
		  curr.next=newnode;
		  
		  }

		   static boolean circleloop()
		   {
		    
		    Node current =head;
		    tail=head;
		    while(current.next!=null)
		    {
		     current=current.next;
		     tail=tail.next;
		    }
		    System.out.println("enter pos");
		     Scanner sc=new Scanner(System.in);
		    int pos=sc.nextInt();
		    Node temp=head;
		    if(pos<0)
		    {
		     return false;
		     }
		    else
		    {
		    
		    for(int i=0;i<pos;i++)
		    {
		     temp=temp.next;
		    }
		    tail.next=temp.next;
		   }
		    return true;
		   }
		   public static void main(String args[]) {
	        linkeddsa l=new linkeddsa();
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    System.out.println("enter value ");
		    for(int i=0;i<n;i++)
		    {
		     l.addlast(sc.nextInt());
		     
		    }
		  System.out.print(circleloop());
		   }
		    
		   }
	}

