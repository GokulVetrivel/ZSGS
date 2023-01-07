import java.util.Scanner;

public class Eighty_Eight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sentence :");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(String a:str)
			System.out.println(a);

	}

}
