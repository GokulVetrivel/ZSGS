import java.util.Scanner;

public class Fifty_Five {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to print c by stars :");
		int n=sc.nextInt();
		int k=0;
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				if(j<n-k ) 
					System.out.print("*");
			}
			k+=3;
			System.out.println();
			
		}
		k=0;
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				if(j<=k ) 
					System.out.print("*");
			}
			k+=3;
			System.out.println();
			
		}

	}

}
