package com.ou_solutions;

public class MergeSortedLists {
	
	static class ListNode {
		
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
		
	}
	
	public static void main(String[] args) {
		
		 // First list
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // Second list
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        
        ListNode result = mergeList(l1, l2);

        print(result);
		
	}
	
	public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
	
	public static ListNode mergeList(ListNode l1, ListNode l2)
	{
		ListNode dummy = new ListNode(-1);
		
		ListNode current = dummy;
		
		while( l1 != null && l2 != null)
		{
			if(l1.val < l2.val)
			{
				current.next = l1;
				l1 = l1.next;
			}
			else {
				current.next = l2;
				l2 = l2.next;
			}
			
			current = current.next;
		}
		
		// Attach remaining nodes
        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }
		
        return dummy.next;
        
	}

}
