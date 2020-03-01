package Practices;

/**
 * Definition for singly-linked list.
 * leetcode problem 203
 * 递归实现删除
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; next = null;}
     
     @Override
 	public String toString(){
    	 StringBuilder res = new StringBuilder();
    	 res.append(((Integer) val).toString() + "->");
    	 while (next != null){
    		 res.append(next.val + "->");
    		 next = next.next;
    	 }
 		return res.toString();
 		
 	}
}

class Solution_203 {
	private ListNode res;
	public ListNode removeElements(ListNode head, int val) {
		if(head == null){return null;}
        if (head.next == null){
            int NodeVal = head.val;
            if(NodeVal == val)
                return null;
            else
                return head;
        }
        else
            res = removeElements(head.next, val);
            head.next = res;
            if (head.val == val){head = head.next;}
            return head;
    }
	
	
	
	public static void main(String[] args){
		ListNode head = new ListNode(5);
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(1);
		head.next = head1;
		head1.next = head2;
		ListNode re = new Solution_203().removeElements(head, 5);
		System.out.println(re);
	}
}
