import java.util.Scanner;

public class Sixty_Three2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		System.out.println("largest element is :"+max(a));
		System.out.println("smallest element is :"+min(a));

	}

	private static int min(int[] a) {
		int t=Integer.MAX_VALUE;
		for(int i:a) {
			if(t>i)
				t=i;
		}
		return t;
	}

	private static int max(int[] a) {
		int t=Integer.MIN_VALUE;
		for(int i:a) {
			if(t<i)
				t=i;
		}
		return t;
	}

}
