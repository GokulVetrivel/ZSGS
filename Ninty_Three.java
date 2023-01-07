import java.util.Scanner;

public class Ninty_Three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the words :");
		String s=sc.next();
		char c[]=s.toCharArray();
		System.out.println(java.util.Arrays.toString(Ascendletter(c,c.length)));

	}

	private static char[] Ascendletter(char[] c, int n) {
		char temp;
		if(n==1)
			return c;
		for(int i=0;i<n-1;i++) {
			if(c[i]<c[i+1]) {
				temp=c[i];
				c[i]=c[i+1];
				c[i+1]=temp;
			}
		}
		return Ascendletter(c,n-1);
		
	}

}
