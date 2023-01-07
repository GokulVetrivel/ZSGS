import java.util.Scanner;

public class Ninty_Six {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word :");
		String str=sc.next();
		char[] ca=str.toCharArray();
		System.out.println("Enter a character to search :");
		char c=sc.next().charAt(0);
		int t =search(ca,c);
		if(t==-1)
			System.out.println(c+" is not present in the string");
		else
			System.out.println(c+" is present in the string index :"+t);
	}

	private static int search(char[] ca, char c) {
		// Linear Search...
		for(int i=0;i<ca.length;i++) {
			if(ca[i]==c)
				return i;
		}
		return -1;

		
	}

}
