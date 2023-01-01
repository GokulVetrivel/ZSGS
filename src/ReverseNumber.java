import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int sum=0,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number...");
		int n=sc.nextInt();
		t=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(t+"-"+sum+"="+(t-sum));

	}

}
