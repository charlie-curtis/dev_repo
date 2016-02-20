package leetcode.increasing_triplet_subsequence;
import org.junit.Assert;
public class SolutionTester {
     public static void main(String[] args) {
	  Solution sol = new Solution();
	  int[][] input = { {1,2,3,4,5}, 
			 {5,4,3,2,1},
			 {0,0,0,0},
			 {10,3,2,4,18,0},
			 {-1,-2,-3},
			 {1,2,3},
			 {-3,-2,1},
			 {0},
			 {},
			 {0,0,0},
			 {-1,0,0},
			 {-1,0,1},
			 {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
			 {Integer.MAX_VALUE, Integer.MAX_VALUE-1, Integer.MAX_VALUE-2},
			 {Integer.MAX_VALUE-2, Integer.MAX_VALUE-1, Integer.MAX_VALUE}
		    };
	  boolean[] expected = {true, false, false, true, false, true, true, false, false, false, false, true, false, false, true};
	  for (int i = 0; i < input.length; i++) {
	       String msg = "iteration: " + i;
	       if (expected[i]) {
		    Assert.assertTrue(msg, sol.increasingTriplet(input[i]));
	       } else {
		    Assert.assertFalse(msg, sol.increasingTriplet(input[i]));
	       }
	  }
     }
}
