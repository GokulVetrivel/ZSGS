import java.util.Scanner;

public class Seventeen {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int r1,r2;
		System.out.print("Enter bigger circle's radius :");
		r1=sc.nextInt();
		System.out.print("Enter smaller circle's radius :");
		r2=sc.nextInt();
		System.out.println("enter unit :");
		String s=sc.next();
		double pi;
		pi=Math.PI;
		System.out.println("The area of the space between circles is :"+
		(pi*(Math.pow(r1, 2)-Math.pow(r2, 2)))+" "+s+" square");
	}

}
