import java.util.Scanner;

public class Eighty_Four {

	public static void main(String[] args) {
		int r,c,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of rows & columns in 1st array:");
		r=sc.nextInt();
		c=sc.nextInt();
		int[][] a=new int[r][c];
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
			a[i][j]=sc.nextInt();
		System.out.println("entered array is :");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		int oddCount=0,evenCount=0;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				if(a[i][j]%2==0)
					evenCount++;
				else
					oddCount++;
					
			}
		}
		System.out.println("no.of even numbers :"+evenCount);
		System.out.println("no.of even numbers :"+oddCount);

	}

}
