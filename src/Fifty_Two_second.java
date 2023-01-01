import java.util.ArrayList;
import java.util.Scanner;

public class Fifty_Two_second {
	static String s="";

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine() ;
		reverseWords(str);

	}

	private static void reverseWords(String str) {
		ArrayList<String> list = new ArrayList<String>();
		String a[]=str.split(" ");
		for(int i=a.length-1;i>=0;i--)
		list.add(a[i]);
		System.out.println(rev(list));
	}
		
		static String rev(ArrayList<String> list){
			if(list.isEmpty()) {
				return s;
			}
			else {
				s+=list.get(0)+" ";
				list.remove(0);
				return rev(list);
			}
		
		
	}

}
