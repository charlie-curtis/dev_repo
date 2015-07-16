public class ListNode{

	public ListNode(int x){
		this.val = x;
	}

	int val;
	public ListNode next;
	
	public ListNode reverseList(ListNode head) {

	if(head == null || head.next ==null){
	    return head;
	}

	ListNode setPrevious = null;
	ListNode setNext = null;
	while(head.next != null){    
	    setNext = head.next;
	    System.out.println("setNext: " + setNext.toString());
	    head.next = setPrevious;
	    setPrevious = head;
	    head=setNext;
	}
	System.out.println(head.toString());
	//edge case. the last element becomes the first element
	head.next = setPrevious;
	return head;
	}
}
