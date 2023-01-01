import java.util.Scanner;

public class Sixty_Two1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length and elements :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("entered array is :"+java.util.Arrays.toString(a));
	
		int[] oddPos=new int[(n/2)+1];
		int[] evenPos=new int[n/2];
		
		int k=0,l=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				oddPos[k]=a[i];
				k++;
			}
			else {
				evenPos[l]=a[i];
				l++;
			}
				
		}
		System.out.println("Odd Position elements :"+java.util.Arrays.toString(oddPos));
		System.out.println("Even Position elements :"+java.util.Arrays.toString(evenPos));

	}

}
