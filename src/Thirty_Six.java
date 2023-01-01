import java.util.Scanner;

public class Thirty_Six {

	public static void main(String[] args) {
		System.out.println("enter array length :");
		Array arr = new Array();
		System.out.println("Even position elements :"+java.util.Arrays.toString(arr.evenPositionNumbers()));
	}

}
class Array{
	Scanner sc = new Scanner(System.in);
	private int n=sc.nextInt();
	
	Array() {
	    System.out.println("enter array elements :");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	}
	private int[] a=new int[n];
	public int[] evenPositionNumbers() {
		int[] b=new int[n/2];
		int j=0;
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
			b[j]=a[i];
			j++;
			}
		}
		return b;
		
	}
	
}