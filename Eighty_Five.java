import java.util.Scanner;

public class Eighty_Five {

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
		int rsum=0,csum=0;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				rsum+=a[i][j];
				
			}
			System.out.println("sum of row "+(i+1)+":"+rsum);
			rsum=0;
		}
		for(i=0;i<c;i++) {
			for(j=0;j<r;j++) {
				csum+=a[j][i];
				
			}
			System.out.println("sum of column "+(i+1)+":"+csum);
			csum=0;
		}

	}

}
