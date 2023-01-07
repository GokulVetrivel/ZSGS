import java.util.Scanner;

public class Ninty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of words :");
		int n=sc.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		String temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(str[i].length()<str[j].length()) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(String a:str)
			System.out.println(a);

	}

}
