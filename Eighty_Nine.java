import java.util.Scanner;

public class Eighty_Nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sentence :");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		
		int wcount=1,n=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				wcount++;
			}
		}
		String []str=new String[wcount];
		str[n]="";
		System.out.println("no.of words :"+str.length);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				str[n]+=s.charAt(i);
			}
			else {
				n++;
				str[n]="";
			}
		}
		for(String a:str)
			System.out.println(a);
	}

}
