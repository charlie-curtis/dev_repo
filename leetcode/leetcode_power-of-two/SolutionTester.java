public class SolutionTester{

   public static void main(String[] args){

   		Solution test = new Solution();

   		int beg = 0;
   		int end = 128;

   		System.out.println("Range of Numbers: (" + beg + "," + end + ")");
   		for(int i = 0; i<=128; i++){

   			if(test.isPowerOfTwo(i)){
   				System.out.println(i + " is a power of two");
   			}
   		}        

    }
} 