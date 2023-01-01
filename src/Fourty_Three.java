import java.util.Scanner;

public class Fourty_Three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and array elements  :");
		int n,nr;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("array entered :"+
			java.util.Arrays.toString(a)+"\nenter no of left rotations :");
		nr=sc.nextInt();		
		leftRotate(a,nr);

	}

	private static void leftRotate(int[] a, int nr) {
		int n=a.length,t,i,j;
		for(i=0;i<nr;i++) {
			t=a[0];
			for(j=0;j<n-1;j++)
				a[j]=a[j+1];
			a[j]=t;
		}
		System.out.println(java.util.Arrays.toString(a));
	}

}
