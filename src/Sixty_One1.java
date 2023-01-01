import java.util.Scanner;

public class Sixty_One1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("entered array is :"+java.util.Arrays.toString(a)+"\nReversed array is :");
		int j=0;
		int[] b=new int[a.length];
		for(int i=n-1;i>=0;i--) {
			b[j]=a[i];
			j++;
		}
			
			System.out.println(java.util.Arrays.toString(b));

	}

}
