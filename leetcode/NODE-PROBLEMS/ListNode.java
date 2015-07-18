public class ListNode
{

	int val;
	ListNode next;
	public ListNode(int x) {
		this.val = x;
	}

	/**This method takes in a linkedlist and reverses it*/
	ListNode reverseList(ListNode head) {

		ListNode setPrevious = null;
		ListNode setNext = null;

		if(head == null || head.next ==null) {
		    return head;
		}

		while(head.next != null) {    
		    setNext = head.next;
		    head.next = setPrevious;
		    setPrevious = head;
		    head=setNext;
		}
		//edge case
		head.next = setPrevious;
		return head;
	}

    //WHY DIDN'T THE COMMENTED OLD VERSION DELETE THE LAST NODE IN THE LIST
    //OMG
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        int carryOver = 0;
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        boolean firstIteration = true;
        
        while(l1 != null || l2 != null || carryOver ==1){
            if(!firstIteration){
                temp.next = new ListNode(0);
                temp = temp.next;
            }
            if(l1!= null){
                carryOver += l1.val;
                l1 = l1.next;
            }
            if(l2!= null){
                carryOver += l2.val;
                l2 = l2.next;
            }
        
            temp.val = carryOver % 10;
           
            carryOver = carryOver>= 10 ? 1 : 0;
            //temp.next = new ListNode(0);
            //temp = temp.next
            firstIteration = false;
            
        }
        //temp.next = null;
        //temp = null;

        return head;
    }
}

