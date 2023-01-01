import java.util.Scanner;

public class Fourty_one {

	public static void main(String[] args) {
		int n;
		System.out.println("enter length of the array :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[a.length];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("the array A is :"+java.util.Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
			b[i]=a[i];
		System.out.println("the array B is :"+java.util.Arrays.toString(b));

	}

}
