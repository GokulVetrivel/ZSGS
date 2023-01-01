import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string with odd lenght :");
		String s=sc.next();
		if(s.length()%2!=0) {
			for(int i=0;i<s.length();i++) {
				for(int j=0;j<s.length();j++) {
					if(i==j || i==s.length()-1-j)
						System.out.print(s.charAt(i)+" ");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("entered string is not odd length..");
	}

}
