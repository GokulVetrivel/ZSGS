import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of students :\nStarting roll no:\nEndindg roll no:\nno of groups:");
		int n,rs,re,ng,f=1;
		n=sc.nextInt();
		rs=sc.nextInt();
		re=sc.nextInt();
		ng=sc.nextInt();
		int d=n/ng;
		if(n%ng==0) {
			System.out.println("can make groups with equal no of students...");
			
			for(int i=0;i<=n;i++) {
				System.out.println("\ngroup "+f+":");
				f++;
				for(int j=0;j<d;j++) {
					System.out.println(rs+(ng*j));
					i++;
				}
				System.out.println("--------");
				rs=rs+1;
			}
		} 
		else
			System.out.println("can't make groups with equal no of students...");
		
	}

}
