package leetcode.basic_calculator_ii;
import org.junit.Assert;
public class SolutionTester {

     public static void main(String[] args) {
	  testGetStopIndex(); 
	  System.out.println("test");
     }
     public static void testGetStopIndex() 
     {
	  StringBuffer sb = new StringBuffer("3 * 9 ");
	  int backwardStop = Solution.getStopIndex(sb, 2, false);
	  int forwardStop = Solution.getStopIndex(sb, 2, true);
	  Assert.assertTrue(true);
	  
     }
}
