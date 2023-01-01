import java.util.Scanner;

public class Fifty {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
				System.out.print(i+" ");
			System.out.println();
		}
		sc.close();

}
}
