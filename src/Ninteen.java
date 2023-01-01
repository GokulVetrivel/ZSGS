import java.util.Scanner;

public class Ninteen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a :");
		int a=sc.nextInt();
		a+=a++ + ++a + --a + a--;
		System.out.println("a is :"+a);
	}
}
