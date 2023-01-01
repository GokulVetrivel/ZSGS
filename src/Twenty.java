import java.util.Scanner;

public class Twenty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x value :");
		int x=sc.nextInt();
		x= x++ * 2 + 3*--x;
		System.out.println("x is :"+x);
	}

}
