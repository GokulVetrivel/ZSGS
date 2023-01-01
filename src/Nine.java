import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first array length and array elemnents:");
		int n1=sc.nextInt();
		int a1[]=new int[n1];
		for(int i=0;i<n1;i++) {
			a1[i]=sc.nextInt();
		}
		
		System.out.println("enter second array length and array elemnents:");
		int n2=sc.nextInt();
		int a2[]=new int[n2];
		for(int i=0;i<n2;i++) {
			a2[i]=sc.nextInt();
		}
		System.out.println("First array :"+java.util.Arrays.toString(a1));
		System.out.println("second array :"+java.util.Arrays.toString(a2));
		int n3=n1+n2;
		int[] a3=new int[n3];
		for(int i=0;i<max(n1,n2);i++) {
			if(i<n1)
				a3[i]=a1[i];
			if(i<n2)
				a3[n1+i]=a2[i];
			
		}
		System.out.println("merged array :"+java.util.Arrays.toString(a3));
		eliminateDublicate(a3);
	
	}

	private static void eliminateDublicate(int[] a3) {
		int t;
		for(int i=0;i<a3.length;i++) {
			for(int j=0;j<a3.length;j++) {
				if(a3[i]<a3[j]) {
					t=a3[i];
					a3[i]=a3[j];
					a3[j]=t;
				}
			}
		}
		System.out.println("merged ascending array :"+java.util.Arrays.toString(a3));
		int a4[]=new int[a3.length];
		int j=0;
		for(int i=0;i<a3.length-1;i++) {
			if(a3[i]!=a3[i+1]) {
				a4[j]=a3[i];
				j++;
			}
		}
		a4[j]=a3[a3.length-1];
		System.out.println(java.util.Arrays.toString(a4));
		System.out.print("merged and sorted array:[");
		for(int i=0;i<=j;i++) {
			if(i!=j)
			System.out.print(a4[i]+", ");
			else
			System.out.print(a4[i]);
			
		}
		System.out.print("]");
		
	}

	private static int max(int n1, int n2) {
		if(n1>n2)
		return n1;
		return n2;
	}
	

}
