import java.util.Scanner;

public class Fourty_Eight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print(k+" ");
			}
			for(int l=n-1;l>=i;l--) {
				System.out.print(l+" ");
			}
		System.out.println();
		}

	}

}
