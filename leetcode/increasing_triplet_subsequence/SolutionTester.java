public class SolutionTester {
     public static void main(String[] args) {
	  Solution sol = new Solution();
	  int[][] input = { {1,2,3,4,5}, {5,4,3,2,1} };
	  for (int i = 0; i < input.length; i++) {
	       if (sol.increasingTriplet(input[i])) {
		    System.out.println("true");
	       } else {
		    System.out.println("false");
	       }
	  }
     }
}
