import java.util.ArrayList;
import java.util.Scanner;

public class Sixty_Two2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
		
		ArrayList<Integer> oddList=new ArrayList<Integer>();
		ArrayList<Integer> evenList=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			if(i%2==0)
				oddList.add(a[i]);
			else
				evenList.add(a[i]);
		}
		System.out.println("odd Position elements are :"+oddList);
		System.out.println("even Position elements are :"+evenList);
		

	}

}
