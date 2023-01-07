import java.util.Scanner;

public class Hundred {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ascii value between A and Z:");
		int n=sc.nextInt();
		if(n>='A' && n<='Z') {
			System.out.println("the character of "+n+" is :"+(char)n);
		}
		else
			System.out.println("invalid input");

	}

}
