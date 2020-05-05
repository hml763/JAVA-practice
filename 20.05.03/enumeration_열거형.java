enum Color{ Red, Green, Blue }


public class enumeration_¿­°ÅÇü {

	public static void main(String[] args) {
		
		for(Color col : Color.values()) {
			System.out.println(col);
		}
		
		
		Color c = Color.Red;
		System.out.println( c + "'s value is : " + c.ordinal());
		System.out.println( c + "'s value is : " + c + "\n");
		
		c = Color.valueOf("Blue");
		System.out.println( c + "'s value is : " + c.ordinal());
		System.out.println( c + "'s value is : " + c + "\n\n");		
			
		c = Color.valueOf("Yellow");
		System.out.println( c + "'s value is : " + c.ordinal());
	}

}
