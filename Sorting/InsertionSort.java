public class InsertionSort extends Sorting {

	//java operates on the object themselves, so you don't have to return the array
	public static void sort(int[] array){
	 
		for(int i = 0; i<array.length-1; i++){
			int startingIndex = array[i];
			for(int j = i+1; j<array.length; j++){
				if(array[i]>array[j]){
					int temp1 = array[j];
					array[j] = array[i];
					array[i] = temp1;
				}
				else{
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{

		int[] array1 = {3,7,9,4,2,0, 32, 90, 12,32,19,138,2093,3,3,3,4,29,10,-8,-42,17};
		sort(array1);
		if(isSorted(array1)){
			System.out.println("I am sorted");
		}
		else{
			System.out.println("I am NOT sorted");
		}
	}
	
}
