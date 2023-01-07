import java.util.Arrays;
import java.util.Scanner;

public class Ninty_Four {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		char c1[],c2[];
		System.out.println("enter first String :");
		s1=sc.next();
		c1=s1.toCharArray();
		System.out.println("enter second String :");
		s2=sc.next();
		c2=s2.toCharArray();
		if(isAnagram(c1,c2)==true)
			System.out.println("strings are anagram");
		else
			System.out.println("strings are not anagram");
	}

	private static boolean isAnagram(char[] c1,char[] c2) {
		if(c1.length!=c2.length)
			return false;
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
		
	}

}
