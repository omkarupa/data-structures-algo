package com.ou_solutions;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	int capacity;
	Node head;
	Node tail;
	Map<Integer,Node> map;

	class Node {
		
		int val;
		Node next;
		Node prev;
		
		public Node(int val)
		{
			this.val = val;
		}
		
	}
	
	
	public LRUCache(int capacity)
	{
		this.capacity = capacity;
		this.map = new HashMap();
		
		 head = new Node(0);
		 tail = new Node(0);
		 
		 head.next = tail;
		 tail.prev = head;
		
	}
	
	public void put(int key, int value)
	{
		if(map.containsKey(key))
		{
			Node node = map.get(key);
			node.val = value;
			map.put(key, node);
			
			//remove from earlier location
			remove(node);
			inserAtHead(node);
			// insert at Head location
		}
		else {
			if(map.size() == capacity)
			{
				Node lastNode = tail.prev;
				
				Node prvNode = lastNode.prev;
				prvNode.next = tail;
				map.remove(lastNode);
			}
			
			Node newNode = new Node(value); 
			
			//insert at Head
			inserAtHead(newNode);
			map.put(key, newNode);
			
		}
	}
	
	public void inserAtHead(Node node)
	{
		Node nextNode = head.next;
		head.next = node;
		node.next = nextNode;
		nextNode.prev = node;
		
	}
	
	public void remove(Node node)
	{
		Node prevNode = node.prev;
		Node nextNode = node.next;
		
		prevNode.next = nextNode;
		nextNode.prev = prevNode;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		LRUCache cache = new LRUCache(4);
		
		cache.put(1, 10);
		
		
		
		
		
	}

}
