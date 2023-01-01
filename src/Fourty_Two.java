import java.util.Scanner;

public class Fourty_Two {

	public static void main(String[] args) {
		System.out.println("enter array length and elements :");
		Scanner sc = new Scanner(System.in);
		int n,t,k=0;
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[a.length];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("ascending order array :"+java.util.Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[k]=a[i];
				k++;
				
			}
			
		}
		b[k]=a[a.length-1];
		System.out.println("ascending ordered and eliminated dublicates array :"+java.util.Arrays.toString(b));
		System.out.print("Sorted array :[");
		for(int i=0;i<k;i++)
			System.out.print(b[i]+", ");
		System.out.println(b[k]+"]");
		
		int c[]=new int[k+1];
		
		int count =0,l=0;
		for(int i=0;i<a.length-1;i++) {
			count++;
			if(a[i]!=a[i+1]) {
				c[l]=count;
				l++;
				count=0;
			}
			
		}
		c[l]=count+1;
		System.out.println("elements counts "+java.util.Arrays.toString(c));
		
		for(int i=0;i<=l;i++) {
			System.out.println(b[i]+" present "+c[i]+" times");
		}
	}

}
