import java.util.Scanner;

public class Fourty_Six {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and array elements  :");
		int n,nr;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("array entered :"+
			java.util.Arrays.toString(a)+"\nenter no of right rotations :");
		nr=sc.nextInt();		
		rightRotate(a,nr);

	}

	protected static void rightRotate(int[] a, int nr) {
		int n=a.length,t,i,j;
		for(i=0;i<nr;i++) {
			t=a[n-1];
			for(j=n-2;j>=0;j--)
				a[j+1]=a[j];
			a[j+1]=t;
		}
		System.out.println(java.util.Arrays.toString(a));

	}

}
