import java.util.Scanner;

public class Thirty_Eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,t=Integer.MIN_VALUE;
		System.out.println("Enter Array length :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements :");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int b:a) {
			if(b>t)
				t=b;
		}
		System.out.println("the largest element in array is :"+t);

	}

}
