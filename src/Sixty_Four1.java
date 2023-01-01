import java.util.Scanner;

public class Sixty_Four1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		//copy from array a to array b
		int j=0;
		int[] b=new int[a.length];
		for(int i:a) {
			b[j]=i;
			j++;
		}
		System.out.println("copied array is :"+java.util.Arrays.toString(b));

	}

}
