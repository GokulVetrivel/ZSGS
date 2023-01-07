import java.util.Scanner;

public class Ninty_Nine1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word :");
		String s=sc.next();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(s.charAt(i)>90)
				System.out.print((char)(s.charAt(i)-32));
			else
				System.out.print(s.charAt(i));
		}
	}

}
