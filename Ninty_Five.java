import java.util.Scanner;

public class Ninty_Five {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,str="";
		System.out.println("enter the String :");
		s=sc.next();
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		if(s.equals(str))
			System.out.println("it is palindrome");
		else
			System.out.println("it is not palindrome");
	}

}
