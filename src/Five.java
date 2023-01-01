import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("Enter an alphabet...");
		Scanner sc = new Scanner(System.in);
		char c=sc.next().toUpperCase().charAt(0);
		int c1=26-('Z'-c);
		
		for(int i=c1-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(i+'A')+" ");
			}
			System.out.println();
		}
	}

}
