import java.util.Arrays;
import java.util.Scanner;

public class Seventy1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		
		secondLargest(a);
	}

	private static void secondLargest(int[] a) {
		int i,n=a.length;
		if(n<2) {
			System.out.println("invalid input");
			return;
		}
		Arrays.sort(a);
		for(i=n-2;i>=0;i--) {
			if(a[i]!=a[n-1]) {
				System.out.println("second largest number is :"+a[i]);
				return;
			}
		}
		System.out.println("There is no second largest number");
		
	}

}
