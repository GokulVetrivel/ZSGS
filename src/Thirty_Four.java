import java.util.Scanner;

public class Thirty_Four {

	public static void main(String[] args) {
		Natural_Number natN = new Natural_Number();
		System.out.println("The sum is :"+natN.getsum());
		System.out.println("the largest digit :"+natN.largest_DigitOfSum());

	}

}
class Natural_Number{
	private int a;
	private int total=0;
	Scanner sc = new Scanner(System.in);
	Natural_Number(){
		System.out.println("Enter a Natural number :");
		a=sc.nextInt();
	}
	public int getNatural_Number() {
		return a;
	}
	public void setNatural_Number(int n) {
		a=n;
	}
	public int getsum() {
		if(a>0) {
			while(a>0) {
				total+=a;
				a--;
			}
		}
		else
			System.out.println(a+" is not a Natural number");
		return total;	
	}
	public int largest_DigitOfSum() {
		int l=total;
		int r,rm=0;
		while(l>0) {
			r=l%10;
			l/=10;
			if(r>rm) {
				rm=r;
			}
		}
		return rm;
	}
}
