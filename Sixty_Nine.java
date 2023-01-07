import java.util.Scanner;

public class Sixty_Nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		System.out.println("no.of Right rotations :");
		int r=sc.nextInt();
		System.out.println("rotated array :"+java.util.Arrays.toString(rightRotate(a,r)));
	}

	private static int[] rightRotate(int[] a, int r) {
		int t,i,j,n=a.length;
		for(i=0;i<r;i++) {
			t=a[n-1];
			for(j=n-2;j>=0;j--) {
				a[j+1]=a[j];
			}
			a[0]=t;
		}
		return a;
	}

}
