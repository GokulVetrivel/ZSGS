import java.util.Scanner;

public class Fifty_Four {

	public static void main(String[] args) {
		System.out.println("enter array length and elements :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int []oddPos=new int[n/2+1];
		int []evenPos=new int[n/2];
		int o=0,p=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				oddPos[o]=a[i];
				o++;
			}
			else {
				evenPos[p]=a[i];
				p++;
			}
		}
		System.out.println("odd pos :"+java.util.Arrays.toString(oddPos));
		System.out.println("Evenpos pos :"+java.util.Arrays.toString(evenPos));
		int temp1,temp2;
		for(int i=0;i<oddPos.length;i++) {
			for(int j=0;j<oddPos.length;j++) {
				if(oddPos[i]>oddPos[j]) {
					temp1=oddPos[i];
					oddPos[i]=oddPos[j];
					oddPos[j]=temp1;
				}
			}
			
		}
		for(int i=0;i<evenPos.length;i++) {
			for(int j=0;j<evenPos.length;j++) {
				if(evenPos[i]<evenPos[j]) {
					temp1=evenPos[i];
					evenPos[i]=evenPos[j];
					evenPos[j]=temp1;
				}
			}
			
		}
		System.out.println("odd pos :"+java.util.Arrays.toString(oddPos));
		System.out.println("odd pos :"+java.util.Arrays.toString(evenPos));
		int j=0,k=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				a[i]=oddPos[j];
				j++;
			}
			else {
				a[i]=evenPos[k];
				k++;
			}
		}
		System.out.println("sorted array :"+java.util.Arrays.toString(a));
		}

}
