
public class program6 {
	public static void main(String[] args) {
		
		//&& : and, || : or, ^ : xor
		
		System.out.println("True && true = " + (true && true));
		System.out.println("True && False = " + (true && false));
		System.out.println("false && true = " + (false && true));
		System.out.println("false && False = " + (false && false));
		
		System.out.println("True || true = " + (true || true));
		System.out.println("True || False = " + (true || false));
		System.out.println("false || true = " + (false || true));
		System.out.println("false || False = " + (false || false));

		System.out.println( true ^ true ); // false
		System.out.println( true ^ false ); // true
		System.out.println( false ^ true ); // true
		System.out.println( false ^ false ); // false

		System.out.println( 5 ^ 6 ); // 3
		
		
	}
}
