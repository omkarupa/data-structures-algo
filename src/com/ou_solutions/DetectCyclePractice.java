package com.ou_solutions;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class DetectCyclePractice {

    public static void main(String[] args) {

        // Creating nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        // Connecting nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Creating cycle
      //  n5.next = n2;

        // Head node
        ListNode head = n1;

        // Your logic here
        boolean isCyclePresent = false;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
        	slow = slow.next;
        	
        	fast = fast.next.next;
        	
        	if(slow == fast)
        	{
        		System.out.println("Found cycle" );
        		return;
        	}
        	
        }
        
        System.out.println("No cycle detected");
        
    
    }
}