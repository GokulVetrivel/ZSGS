import java.util.Scanner;

public class MulSub {

	public static void main(String[] args) {
		System.out.println("Enter number ...");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("multiplication table..");
		for(int i=1;i<=10;i++) 
			System.out.println(i+"x"+n+"="+i*n);
		System.out.println("----------------\nSubraction table...");
		for(int i=0;i<=10;i++)
			System.out.println(i+"-"+n+"="+(i-n));

	}

}
