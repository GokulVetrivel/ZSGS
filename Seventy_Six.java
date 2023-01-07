import java.util.Scanner;

public class Seventy_Six {

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
		System.out.println("Transpose matrix is :");
		
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
			System.out.print(a[j][i]+" ");
			}
		System.out.println();
		}

	}

}
