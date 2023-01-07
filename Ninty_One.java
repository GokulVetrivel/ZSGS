import java.util.Scanner;

public class Ninty_One {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word :");
		String s=sc.next();
		char c[]=s.toCharArray();
		char ch;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(c[i]<c[j]) {
					ch=c[i];
					c[i]=c[j];
					c[j]=ch;
				}
			}
		}
		System.out.println(c);

	}

}
