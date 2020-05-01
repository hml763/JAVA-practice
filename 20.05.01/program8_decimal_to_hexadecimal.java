
public class program8_decimal_to_hexadecimal {

	public static void main(String[] args) throws java.io.IOException {
		
		int value = 0;
		char ch;
		
		System.out.print("Enter a super digit : " );
		ch = (char) System.in.read();
		
		switch(ch) {
			case 'A': case 'B': case 'C': case 'D': case 'E': case 'F':
				value = ch -'A' + 10;
				break;
				
			case 'a': case 'b': case 'c': case 'd': case 'e': case 'f':
				value = ch - 'a' + 10;
				break;
				
			default: System.out.println(ch + " is not a hexadigit");
		}
		
		System.out.println(value);
		
	}

}
