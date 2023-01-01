import java.util.Scanner;

public class Sixty {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Input the number of terms : ");
		int n=sc.nextInt();
		int r=0,sum=0;
		for(int i=0;i<n;i++) {
			r=r*10+1;
			sum+=r;
			if(i<n-1)
				System.out.print(r+"+");
			else
				System.out.print(r);
		}
		System.out.println("\nThe Sum is : "+sum);

	}

}
