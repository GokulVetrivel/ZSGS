import java.util.Scanner;

public class Thirty_Five {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		do {
		Factorial fact = new Factorial();
		System.out.println("the factorial value is :"+fact.factorial());
		System.out.println("the sum of digits of Factorial :"+fact.sumFactorial());
		System.out.println("press '1' to continue ... ");
		n=sc.nextInt();
		}while(n==1);
	}

}
class Factorial{
	Scanner sc =new Scanner(System.in);
	private int n,total=1;
	
	Factorial(){
		System.out.println("Enter a positive integer :");
		n=sc.nextInt();
	}
	public int factorial() {
		while(n>0) {
			total=total*n;
			n--;
		}
		return total;
	}
	public int sumFactorial() {
		int r,n=0;
		while(total>0) {
			r=total%10;
			n+=r;
			total/=10;
		}
		return n;
		
	}
}
