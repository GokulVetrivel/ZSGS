import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		System.out.println("enter array length and elements :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		int b[]=new int[a.length];
		int t;
		n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("ascending order :"+java.util.Arrays.toString(a));
		for(int i=0;i<n-1;i++) {
			if(i<n/2) {
				b[i*2]=a[i];
				b[i*2+1]=a[n-1-i];
			}
			b[n-1]=a[(n/2)];
		}
		System.out.println("sorted max next to min :"+java.util.Arrays.toString(b));
	}

}
