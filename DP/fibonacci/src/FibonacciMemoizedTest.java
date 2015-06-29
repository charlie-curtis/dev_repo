
public class FibonacciMemoizedTest {

	public static void main(String[] args){
		
		FibonacciMemoized object = new FibonacciMemoized();

		for(int i = 0; i< 100; i++){
			System.out.println(i+","+object.computeFibonacciNumber(i));
		}
	}
}
