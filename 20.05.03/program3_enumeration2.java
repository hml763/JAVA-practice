enum Week{ 
	Sunday(0), Monday(1), Tuesday(2), Wednesday(4), Thurday(10), Friday(20), Saturday(30);
	
	private final int value;
	Week(int value){ this.value = value;}
	public int value() {return value;}
}
public class program3_enumeration2 {
	public static void main(String[] args) {
		
		for(Week w : Week.values()) {
			System.out.println(w + ": ordinal = " + w.ordinal() + 
					", value = " + w.value());
		}
		
	}
}
