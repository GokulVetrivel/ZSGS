import java.util.Scanner;

public class Sixteeen {

	public static void main(String[] args) {
		System.out.println("enter a,b,c values (consider the eaquation ax^2 +bx +c) :");
		int a,b,c;
		double x2;
		double x1;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		x1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
		x2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
		System.out.println("solution is :"+x1 +","+x2);

	}

}
