import java.util.Scanner;

public class Fifteen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lengths of cylinder's radius and height :");
		int a,r,h;
		r=sc.nextInt();
		h=sc.nextInt();
		double pi=Math.PI;
		System.out.println("Area of the cylinder is :"+((2*pi*r*h)+(2*pi*r*r)));

	}

}
