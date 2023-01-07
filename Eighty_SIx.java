import java.util.Scanner;

public class Eighty_SIx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length :");
		int n=sc.nextInt();
		char[] c=new char[n];
		for(int i=0;i<n;i++)
			c[i]=sc.next().charAt(0);
		for(int i=0;i<n;i++)
			System.out.println(c[i]);

	}

}
