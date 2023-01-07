import java.util.Scanner;

public class Eighty_Two {

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
		int count =0;
		if(r==c) {
			int z=r-1;
			int zc=(z*(z+1))/2;
			for(i=0;i<r;i++) {
				for(j=0;j<c;j++) {
					if(j>i && a[i][j]==0)
						count++;
				}
			}
			if(count==zc)
				System.out.println("it is lower triangular matrix");
			else
				System.out.println("it is not lower triangular matrix");
		}
		else
			System.out.println("it is not lower triangular matrix");
	}

}
