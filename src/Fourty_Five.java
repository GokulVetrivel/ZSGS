import java.util.Scanner;

public class Fourty_Five {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("sum is :"+arraySum(a));
		sc.close();

	}

	private static int arraySum(int[] a) {
		int total=0;
		for(int i=0;i<a.length;i++)
			total+=a[i];
		return total;
	}

}
