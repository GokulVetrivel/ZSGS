import java.util.Scanner;


public class Fifty_Two_Third {
	static String s="";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence :");
		String str=sc.nextLine();
		System.out.println(rev(str));
	}
	private static String rev(String str) {
		if(str.isEmpty())
			return str;
		String temp[]=str.split(" ", 2);
		String firstWord=temp[0];
		String reminingWord;
		if(temp.length==2)
			 reminingWord=temp[1];
		else {
			reminingWord="";
		}
		return rev(reminingWord)+firstWord+" ";
			
	}

}
