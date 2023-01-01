import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an alphabet...");
		char a=sc.next().toUpperCase().charAt(0);
		int c1='A';
		int c2='Z';
		int c3=a;
		for(int i=a;i<=c2;i++) {
			System.out.print((char)i+" ");
		}
	}

}
