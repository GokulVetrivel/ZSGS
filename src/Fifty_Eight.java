import java.util.Scanner;

public class Fifty_Eight {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j<n-i)
					System.out.print("*");
				else
					System.out.print("_");
			}
			for(j=0;j<n;j++) {
				if(j<i)
					System.out.print("_");
				else
					System.out.print("*");
			}
			
			System.out.println();
		}
		for(i=1;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print("_");
			}
			for(j=0;j<n;j++) {
				if(j<n-1-i)
					System.out.print("_");
				else
					System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
