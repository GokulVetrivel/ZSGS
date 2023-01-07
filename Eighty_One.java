import java.util.Scanner;

public class Eighty_One {

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
		
		System.out.println("enter no.of rows & columns in 2nd array:");
		r2=sc.nextInt();
		c2=sc.nextInt();
		int[][] b=new int[r2][c2];
		for(i=0;i<r2;i++)
			for(j=0;j<c2;j++)
			b[i][j]=sc.nextInt();
		System.out.println("1st matrix is :");
		for(i=0;i<r1;i++) {
			for(j=0;j<c1;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("2nd matrix is :");
		for(i=0;i<r2;i++) {
			for(j=0;j<c2;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		int count=0;
		if(r1==r2 && c1==c2) {
			for(i=0;i<r2;i++) {
				for(j=0;j<c2;j++) {
					if(a[i][j]==b[i][j])
						count++;
				}
			}
			if(count==r2*c2)
				System.out.println("matrixes are equal");
			else
				System.out.println("matrixes are not equal");
		}
		else
			System.out.println("matrixes are not equal");

	}

}
