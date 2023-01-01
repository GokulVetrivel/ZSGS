
public class Bitwise {

	public static void main(String[] args) {
		boolean[] a= {true,false};
		boolean[] b= {true,false};
		and(a,b);
		or(a,b);
		xor(a,b);
	}
	static void and(boolean[] a, boolean[] b) {
		System.out.println("AND Opearation\n----------");
		for(boolean c:a) {
			for(boolean d:b) {
				System.out.println(c+"&"+d+"="+(c&d));
			}
		}
	}
	static void or(boolean[] a, boolean[] b) {
		System.out.println("\n------------\nOR Opearation\n----------");
		for(boolean c:a) {
			for(boolean d:b) {
				System.out.println(c+"|"+d+"="+(c|d));
			}
		}
	}
	static void xor(boolean[] a,boolean[] b) {
		System.out.println("\n------------\nXOR Opearation\n----------");
		for(boolean c:a) {
			for(boolean d:b) {
				System.out.println(c+"^"+d+"="+(c^d));
			}
		}
	}

}
