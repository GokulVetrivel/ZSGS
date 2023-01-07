import java.util.Scanner;

public class Sixty_Eight {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		System.out.println("sum :"+sum(a));

	}

	private static int sum(int[] a) {
		int i,n=a.length,total=0;
		for(i=0;i<n;i++) {
			total+=a[i];
		}
		return total;
	}

}
