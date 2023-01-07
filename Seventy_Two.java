import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Seventy_Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		System.out.println("Dublicates eleminated aray :"+eliminateDublicate(a));

	}

	private static ArrayList<Integer> eliminateDublicate(int[] a) {
		Arrays.sort(a);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i;
		for(i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1])
				list.add(a[i]);
		}
		list.add(a[i]);
		return list;
	}

}
