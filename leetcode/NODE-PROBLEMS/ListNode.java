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


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        int carryOver = 0, num1 = 0, num2 = 0, result = 0;
        ListNode returnMe = new ListNode(0);
        ListNode head = returnMe;
        
        while(l1 != null || l2 != null || carryOver == 1){
            
            ListNode temp = new ListNode(0);
            num1 = l1 == null? 0 : l1.val;
            num2 = l2 == null? 0 : l2.val;
            result = num1+num2+carryOver;
            System.out.println("result is " + result);
            
            if(result >= 10){
                System.out.println("carry 1 ran");
                carryOver = 1;
            }else{
                System.out.println("Carry 0 ran");
                carryOver = 0;
            }
            
            System.out.println("val is: " + result % 10);
            returnMe.val = result % 10;
            l1=  l1 == null? l1 : l1.next;
            l2 = l2 == null? l2 : l2.next;
            if(l1 != null || l2 != null || carryOver ==1){
                //we running the loop again, boyz
                returnMe.next = temp;
                returnMe = returnMe.next;  
            }
        }
        System.out.println("head is" + head.val);
        return head;
    }
}

