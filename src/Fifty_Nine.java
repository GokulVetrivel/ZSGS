import java.util.Scanner;

public class Fifty_Nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s1,s2;
		System.out.println("enter string 1 :");
		s1=sc.next();
		System.out.println("enter string 2 :");
		s2=sc.next();
		System.out.println(isSubString(s1,s2));
	}

	private static int isSubString(String s1, String s2) {
	    int c=0,l=s2.length();
		if(s1.contains(s2)) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==s2.charAt(0)) {
					for(int j=i;j<i+s2.length();j++){
						if(s2.charAt(j-i)==s1.charAt(j))
							c++;
					}
				}
				if(c==l)
					return i;
			}
			
		}
		return -1;

	}

}
