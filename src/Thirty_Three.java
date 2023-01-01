import java.util.Scanner;

public class Thirty_Three {
	
	public static void main(String[] args) {
		Character c=new Character();
		int a=c.getChararater();
		if((a>='a' && a<='z')||(a>='A' && a<='Z'))
			System.out.println(c.getChararater()+" is an alphabet");
		else
			System.out.println(c.getChararater()+" is not an alphabet");

	}

}
class Character{
	private char c;
	Scanner sc=new Scanner(System.in);
	
	Character(){
		System.out.print("enter a character :");
		c=sc.next().charAt(0);
	}
	public void setCharacter(char ch) {
		c=ch;
		
	}
	public char getChararater() {
		return c;
	}
}
