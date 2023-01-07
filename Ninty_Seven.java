import java.util.Arrays;
import java.util.Scanner;

//to find a character in a given string using binary search
public class Ninty_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter the String :");
		s=sc.next();
		System.out.println("Enter character to search :");
		char c=sc.next().charAt(0);
		char[] ca=s.toCharArray();
		Arrays.sort(ca);
		
		if(searchChar(ca,c)==-1)
			System.out.println(c+" is not present in "+s);
		else
			System.out.println("index of "+c+" in "+s+" is "+searchChar(ca,c));
	}

	private static int searchChar(char[] ca, char c) {
		int start=0,end=ca.length-1,mid;
		while(start<=end) {
			mid=(start+end)/2;
		
			if(ca[mid]==c)
				return mid;
			else if(ca[mid]<c) 
				start=mid;
			else
				end=mid;
		}
		return -1;
				
	}

}
