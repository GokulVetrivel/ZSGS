import java.util.Scanner;

public class Twenty_Seven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a,b values :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping \na is :"+a+"\nb is :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping \na is :"+a+"\nb is :"+b);

	}

}
