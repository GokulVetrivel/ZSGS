import java.util.Scanner;

public class Twenty_Nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charater :");
		char a=sc.next().charAt(0);
		char[] c= {'a','A','e','E','i','I','o','O','u','U'};
		int b=0;
		for(char c1:c) {
			if(a==c1) { 
				System.out.println(a+" is vowel");
				b++;
				break;
			}
		}
		if(b==0)
			System.out.println(a+" is consonent");
	}

}
