import java.util.HashMap;
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();

        for(int i =0; i<s.length();i++){

        	if(map.containsKey(s.charAt(i))){
        		//Keys cannot map to duplicate letters
        		if(map.get(s.charAt(i)) != t.charAt(i)){
        			return false;
        		}
        	}
        	else{
        		//Keys cannot map to duplicate letters
        		if(map.containsValue(t.charAt(i))){
        			return false;
        		}
        		map.put(s.charAt(i), t.charAt(i));
        	}
        }
        return true;
    }
}