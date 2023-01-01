import java.util.Scanner;

public class Fifty_Six {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		int i,j,k,c=1;
		k=(int) ((Math.sqrt(1+8*n)+1)/2);
			
		for(i=0;i<k;i++) {
			for(j=0;j<k;j++) {
				if(j<k-i)
					System.out.print(" ");
			}
			for(j=0;j<k;j++) {
				if(j<=i && c<=n) {
					System.out.print(c+" ");
					c++;
				}
			}
			System.out.println();
		}
		}

}
