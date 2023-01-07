import java.util.Scanner;

public class Sixty_Six1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		System.out.println("no.of rotations :");
		int r=sc.nextInt();
		System.out.println("rotated array :"+java.util.Arrays.toString(leftRotate(a,r)));
	}

	private static int[] leftRotate(int[] a, int r) {
		int t,i,j;
		for(i=0;i<r;i++) {
			t=a[0];
			for(j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=t;
		}
		return a;
	}

}
