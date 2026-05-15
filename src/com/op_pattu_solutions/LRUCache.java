package com.op_pattu_solutions;

import java.awt.print.Printable;
import java.util.HashMap;

public class LRUCache {
	
	class Node{
		
		int val;
		Node next;
		Node prev;
		
		public Node(int val)
		{
			this.val = val;
		}
		
	}
	
	int capacity;
	Node head;
	Node tail;
	HashMap<Integer,Node> map;
	
	
	public LRUCache(int capacity)
	{
		this.capacity = capacity;
		map = new HashMap<Integer, LRUCache.Node>();
		
		head = new Node(0);
		tail = new Node(0);
		
		head.next = tail;
		tail.prev = head;
		
	}
	
	public int get(int key)
	{
		Node node = map.get(key);
		remove(node);
		insertAtHead(node);
		return node.val;
	}
	
	
	public void put(int key,int value)
	{
		if(map.containsKey(key))
		{
			Node node = map.get(key);
			node.val = value;
			
			map.put(key, node);
			insertAtHead(node);
		}
		else {
			if(map.size() == capacity)
			{
				Node node = tail.prev;
				remove(node);
				map.remove(node);
			}
			
			Node newNode = new Node(value);
			map.put(key, newNode);
			insertAtHead(newNode);
		}
		
	}


	private void remove(Node node) {
		
		Node prevNode = node.prev;
		prevNode.next = tail;
		tail.prev = prevNode;
		
		
	}
	
	public void print()
	{
		Node node = head.next;
		System.out.print("[ ");
		while(node.next != null)
		{
			System.out.print(","+ node.val + "," );
			node = node.next;
		}
		System.out.print(" ]");
	}


	private void insertAtHead(Node node) {
		
		Node nextNode = head.next;
		head.next = node;
		node.next = nextNode;
		node.prev = head;
		nextNode.prev = node;
		
	}
	
	public static void main(String[] args) {
		
		LRUCache cache = new LRUCache(4);
		
		cache.put(1, 10);
		
		cache.put(2, 20);
		
		cache.print();
		
		cache.get(1);
		
		cache.print();
		
		cache.put(3, 30);
		
		cache.print();
		
		cache.put(4, 40);
		
		cache.print();
		
		cache.put(5, 50);
		
		cache.print();
		
		
	}

}
