import java.util.Scanner;

public class Eighteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b values :");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		m1(a,b);
		m2(a,b);
		m3(a,b);
		int x= 69>>>2;
		System.out.println("x=69>>>2 :"+x);
	}

	private static void m3(int a, int b) {
		a*=b+5;
		System.out.println("a*=b+5 :"+a+"\na is :"+a+"\nb is :"+b);
	}

	private static void m2(int a, int b) {
		int c=a%b++;
		System.out.println("a%b++ :"+c+"\na is :"+a+"\nb is :"+b);
	}

	private static void m1(int a,int b) {
		int c=++a-b--;
		System.out.println("++a-b–- :"+c+"\na is :"+a+"\nb is :"+b);
	}

}
