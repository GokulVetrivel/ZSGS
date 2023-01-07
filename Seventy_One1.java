import java.util.Arrays;
import java.util.Scanner;

public class Seventy_One1 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array length and elements :");
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println("entered array is :"+java.util.Arrays.toString(a));
			
			secondSmallest(a);
		}

		private static void secondSmallest(int[] a) {
			int i,n=a.length;
			if(n<2) {
				System.out.println("invalid input");
				return;
			}
			Arrays.sort(a);
			for(i=0;i<n;i++) {
				if(a[i]!=a[1+1]) {
					System.out.println("second smallest number is :"+a[i+1]);
					return;
				}
			}
			System.out.println("There is no second smallest number");
			
		
	}

}
