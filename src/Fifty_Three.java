import java.util.Scanner;

public class Fifty_Three {

	public static void main(String[] args) {
		System.out.println("input (eg :a3b10):");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String num[]=str.split("[a-z]+");
		String let[]=str.split("[1-99]+");
		
		for(int i=0;i<let.length;i++) {
			for(int j=0;j<Integer.parseInt(num[i+1]);j++)
			System.out.print(let[i]);
		}
	}

}
