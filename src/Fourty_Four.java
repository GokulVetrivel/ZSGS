import java.util.ArrayList;
import java.util.Scanner;

public class Fourty_Four {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		dublicateElements(a);

	}

	private static void dublicateElements(int[] a) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("dublicate elements are :");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					if(list.contains(a[i]))
						break;
					else
						list.add(a[i]);
				}
			}
		}
		System.out.println(list);
		
	}

}
