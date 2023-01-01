import java.util.Scanner;

public class Sixty_Five1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		int i,j,t,c=1;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Ascending order array is :"+java.util.Arrays.toString(a));
		int[] b=new int[n];
		int d=0;
		for(i=0;i<n-1;i++) {
			if(a[i]==a[i+1]) {
				c++;
			}
			else {
				b[d]=c;
				c=1;
				System.out.println(a[i]+" present "+b[d]+" times");
				d++;
			}
				
		}
		b[d]=c;
		System.out.println(a[n-1]+" present "+b[d]+" times");
		
	}

}
