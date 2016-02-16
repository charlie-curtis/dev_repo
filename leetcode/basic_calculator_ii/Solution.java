package leetcode.basic_calculator_ii;
public class Solution {
     public int calculate(String s) {
	  StringBuffer sb = new StringBuffer(); 
	  int i = 0;
	  int startIndex = 0;
	  int endIndex = 0;
	  sb.append(s);
	  if (sb.charAt(i) == '\\' || sb.charAt(i) == '*') {
	       startIndex = getStopIndex(sb, i, false);
	       endIndex = getStopIndex(sb, i, true); 
	       doMath(sb, startIndex, endIndex);
	  }
	  
	  return -1;
     }
     public static int getStopIndex(StringBuffer sb, int index, boolean forward) { 
	  int step = 1;
	  if (!forward) {
	       step = -1;
	  } 
	  boolean didMove = false; 
	  while (sb.charAt(index) != '\\' && sb.charAt(index) != '*' && sb.charAt(index) != '+' && sb.charAt(index) != '-') {
	       index += step; 
	       didMove = true;
	  }
	  if (didMove) {
	       index -= step;
	  }
	  return index; 
     }
     public static void doMath(StringBuffer sb, int startIndex, int endIndex) {
	  int firstNumber = 0;
	  int secondNumber = 0;
	  char operand = ' ';
     }
}
