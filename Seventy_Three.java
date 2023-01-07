import java.util.Scanner;

public class Seventy_Three {

	public static void main(String[] args) {
		int r1,c1,r2,c2,i,j;
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
		System.out.println("+");
		for(i=0;i<r2;i++) {
			for(j=0;j<c2;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("=");
		
		if(r1==r2 && c1==c2) {
			int[][] s=new int[r1][c1];
			for(i=0;i<r1;i++)
				for(j=0;j<c1;j++)
					s[i][j]=a[i][j]+b[i][j];
			for(i=0;i<r1;i++) {
				for(j=0;j<c1;j++)
					System.out.print(s[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("addion operation is not possible for these two matrices");
		

	}

}
