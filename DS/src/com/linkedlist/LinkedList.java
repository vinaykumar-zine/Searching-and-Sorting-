package com.linkedlist;

public class LinkedList {
	
	public Node head;
	public Node last;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public LinkedList() {
		head = null;
	}
	
	public void addElem(int val) {
		Node tmp = head;
		Node node = new Node(val);
		if(head==null) {
			head = node;
			last = node;
		}
		else {
			
			last.next = node;
			node.prev = last;
			last = last.next;
		}
	}
	
	public void printList() {
		Node tmp = head;
		while(tmp!=null) {
			System.out.print(tmp.data+" -> ");
			tmp = tmp.next;
		}
		
		System.out.println("Null");
	}
	
	public void printRevList() {
		Node tmp = last;
		while(tmp!=null) {
			System.out.print(tmp.data+" <- ");
			tmp = tmp.prev;
		}
		
		System.out.println("Null");
	}

}
