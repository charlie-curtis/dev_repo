public class ListNodeTester{


	public static void main(String[] args){
		test_reverseList();
	}

	protected static void test_reverseList(){
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = null;

		ListNode result = node1.reverseList(node1);
	//	System.out.println("test");
		int i = 0;
		while(result != null){
			System.out.println(result.val);
			result = result.next;

		}
			
	}

}