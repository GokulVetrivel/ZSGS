import java.util.Scanner;

public class Thirty_Seven {

	public static void main(String[] args) {
		System.out.println("enter array length :");
		Arrayy arr = new Arrayy();
		System.out.println("Odd position elements :"+java.util.Arrays.toString(arr.oddPositionNumbers()));
	}

}
class Arrayy{
	Scanner sc = new Scanner(System.in);
	private int n=sc.nextInt();
	
	Arrayy() {
	    System.out.println("enter array elements :");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	}
	private int[] a=new int[n];
	public int[] oddPositionNumbers() {
		int[] b=new int[n/2];
		int j=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
			b[j]=a[i];
			j++;
			}
		}
		return b;
		
	}
	
}