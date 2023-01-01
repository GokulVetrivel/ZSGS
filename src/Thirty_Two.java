import java.util.Scanner;

public class Thirty_Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int a=sc.nextInt();
		if(a==0) 
			System.out.println(a+" is neither positive nor negative number");
		else if(a>0)
			System.out.println(a+" is positive number");
		else
			System.out.println(a+" is negative number");

	}

}
