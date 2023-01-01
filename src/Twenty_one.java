import java.util.Scanner;

public class Twenty_one {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter y value :");
		int y=sc.nextInt();
		 int z = (++y * (y++ + 5));
		System.out.println("z is :"+z);
	}


}
