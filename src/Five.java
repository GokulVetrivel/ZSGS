
public class Five {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
		
	}
public static String longestPalindrome(String s) {
        if(s.length()<=1)
        	return s;
        int start =0,end=1,len=0;
        String ts="";
        while(start<s.length()-1) {
        	if(isPalindrome(s.substring(start, end))) {
        		if(len < s.substring(start, end).length()){
        			ts=s.substring(start, end);
        			len=s.substring(start, end).length();
        		}
        	}
        	end++;
        	if(end==s.length()+1) {
        		start++;
        		end=start+1;
        	}
        		
        }
        return ts;
    }
public static boolean isPalindrome(String s) {
	String s2="";
	for(int i=s.length()-1;i>=0;i--) {
		s2+=s.charAt(i);
	}
	if(s.equals(s2))
		return true;
	else 
		return false;
}

}
