public class Solution{

	public int reverseBits(int n) {
     
     	int num = 1;
     	int largestInt  = -2147483648;
     	int count = 0;
     	
     	for(int i = 0; i<32; i++){

     		if((num & n) != 0){
              count += largestInt;
     		}
     		largestInt= largestInt>>1;
            if(i == 0){
                largestInt = -1*largestInt;
            }
     		num = num<<1;
     	}   
     	
     	return count;
    }

    public static void main(String[] args){

    	Solution sol = new Solution();
        int value = 64;
        int result = sol.reverseBits(value);
    	//System.out.println(result);
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toBinaryString(sol.reverseBits(result)));
        //System.out.println(Integer.toBinaryString(result));

    }

}