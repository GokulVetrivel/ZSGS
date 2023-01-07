import java.util.Scanner;

public class Ninty_Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of words :");
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		System.out.println(java.util.Arrays.toString(AscendString(str,n)));

	}

	private static String[] AscendString(String[] str,int n) {
		String temp;
		if(n==1) {
			return str;
		}
		for(int i=0;i<n-1;i++) {
			if(str[i].length()>str[i+1].length()) {
				temp=str[i];
				str[i]=str[i+1];
				str[i+1]=temp;
			}
		}
		return AscendString(str,n-1);
		
	}

}
