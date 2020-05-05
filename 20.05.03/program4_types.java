
public class program4_types {
	
	static final double PI = 3.141592;

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = 10 > 0;
		//boolean c = 1; 오류남
		
		var price = 200; //var : 변수타입 생략하고 간단히 선언하는 타입. price는 int type
		var name = "hi"; 		// string type
		var pi = 3.14;			// double type
		
		System.out.println("value : " + (price + 100));
		System.out.println("name : " + name);
		System.out.println("pi : " + pi);
		
		double radius = 10.2;
		double Area = radius * radius * PI;
		
		System.out.println("radius : " + radius);
		System.out.println("Area of the circle : " + Area);
		
		
		
	}
}
