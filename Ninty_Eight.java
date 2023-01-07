import java.util.Scanner;

public class Ninty_Eight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a letter in lowercase :");
		char c=sc.next().charAt(0);
		System.out.print((char)(c-32));
		}

	}
