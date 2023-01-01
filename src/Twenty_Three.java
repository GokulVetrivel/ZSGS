import java.util.Scanner;

public class Twenty_Three {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter x value :");
			int x=sc.nextInt();
			int x1= ++x - x++ + --x;
			System.out.println("x1 is :"+x1);
			
		}

}
