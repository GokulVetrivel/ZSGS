import java.util.ArrayList;
import java.util.Scanner;

public class Seventy_Five1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) 
				evenList.add(a[i]);
			else
				oddList.add(a[i]);
		}
		System.out.println("Odd Numbers :"+oddList);
		System.out.println("Even Numbers :"+evenList);
	}

}
