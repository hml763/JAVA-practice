
public class program5 {
	public static void main(String[] args) {
		
		float f1 = 1.414F, f2 = 0.1414e01f;
		double d = 0.1414E1;
		
		System.out.println("f1 = " + f1 + ", f2 : " + f2 + ", d : " + d);
		if(f1 == f2)
			System.out.println("f1, f2 are same");
		
		else
			System.out.println("f1, f2 are different");
		
		if(f2 == d)
			System.out.println("f2, d are same");
		
		else 
			System.out.println("f2, d are different");
		
	}
}
