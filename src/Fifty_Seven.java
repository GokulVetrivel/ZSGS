import java.util.Scanner;

public class Fifty_Seven {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("enetr an odd length String :");
		String s=sc.next();
		int i,j;
		for(i=0;i<s.length();i++) {
			for(j=0;j<s.length();j++) {
				if(j==i)
					System.out.print(s.charAt(j));
				else if(j==s.length()-1-i)
					System.out.print(s.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
