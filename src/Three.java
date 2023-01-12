import java.util.ArrayList;
import java.util.HashSet;

public class Three {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));

	}

	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
		HashSet<Character> hs=new HashSet<>();
		int start=0,end=0,max=0;
		while(end<s.length()) {
		if(!hs.contains(s.charAt(end))) {
			hs.add(s.charAt(end));
		 	end++;
		 	max=Math.max(hs.size(), max);
		}
		else {
			hs.remove(s.charAt(start));
			start++;
		}
		}
		System.out.println(hs);
		return max;
	}

	

}
