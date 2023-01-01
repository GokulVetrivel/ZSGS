import java.util.Scanner;

public class Fifty_Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		int count=1;
		for(int i=0;i<s.length();i++){
			if(c[i]==' ') 
				count++;
		}
		String[] sArray=new String[count];
		int j=0;
		String str="";
		for(int i=0;i<s.length();i++) {
			if(c[i]!= ' ')
				str=str+c[i];
			else {
				sArray[j]=str;
				j++;
				str="";
			}
		}
		sArray[j]=str;
		System.out.println(java.util.Arrays.toString(sArray));
		String revStr="";
		for(int i=sArray.length-1;i>=0;i--) {
			revStr=revStr+sArray[i]+" ";
		}
		System.out.println(revStr);

	}

}
