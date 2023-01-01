import java.util.Scanner;

public class Fourty_Seven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) 
				System.out.print("  ");
			
			for(int k=1;k<=i+1;k++) {
				if(k<=i+1)
				System.out.print(k+" " );
			}	
			for(int l=i;l>0;l--)		
				System.out.print(l+" ");
			
			System.out.println();
		}

	}

}
