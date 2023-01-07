import java.util.ArrayList;
import java.util.Scanner;

public class Sixty_Seven {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		int i,j,t;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("ordered array is :"+java.util.Arrays.toString(a));
		for(i=0;i<n-1;i++) {
			if(a[i]==a[i+1]) {
				if(list.contains(a[i]))
					;
				else
				list.add(a[i]);
			}
		}
		
		System.out.println("dublicate elements are :"+list);
	}

}
