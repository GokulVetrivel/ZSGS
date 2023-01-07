import java.util.Scanner;

public class Seventy_Four {

	public static void main(String[] args) {
		int r1,c1,r2,c2,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of rows & columns in 1st array:");
		r1=sc.nextInt();
		c1=sc.nextInt();
		int[][] a=new int[r1][c1];
		for(i=0;i<r1;i++)
			for(j=0;j<c1;j++)
			a[i][j]=sc.nextInt();
		
		System.out.println("enter no.of rows & columns in 1st array:");
		r2=sc.nextInt();
		c2=sc.nextInt();
		int[][] b=new int[r2][c2];
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
			b[i][j]=sc.nextInt();
		
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("*");
		for(i=0;i<r2;i++) {
			for(j=0;j<c2;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("=");
		
		if(c1==r2) {
			int[][] m=new int[r1][c2];
			for(i=0;i<r2;i++) {
				for(j=0;j<r2;j++) {
					m[i][j]=0;
					for(k=0;k<r1;k++) {
						m[i][j]+=a[i][k]*b[k][j];
					}
				}
				
			}
			for(i=0;i<r2;i++) {
				for(j=0;j<r2;j++) {
					System.out.print(m[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Multiplication operation not possible for these matrices");
	}

}
