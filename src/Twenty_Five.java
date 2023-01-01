import java.util.Scanner;

public class Twenty_Five {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ener Dividend :");
		int dd=sc.nextInt();
		System.out.print("Enter divisor :");
		int dr=sc.nextInt();
		int q=dd/dr;
		int r=dd%dr;
		System.out.println("Quotient is :"+q+"\nReminder is :"+r);

	}

}
