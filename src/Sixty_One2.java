import java.util.Scanner;

public class Sixty_One2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("entered array is :"+java.util.Arrays.toString(a)+"\nReversed array is :[");
		for(int i=n-1;i>=0;i--) {
			if(i!=0)
				System.out.print(a[i]+", ");
			else
				System.out.print(a[i]+"]");
		}

	}

}
