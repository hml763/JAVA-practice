
public class program4_types {
	
	static final double PI = 3.141592;

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = 10 > 0;
		//boolean c = 1; ������
		
		var price = 200; //var : ����Ÿ�� �����ϰ� ������ �����ϴ� Ÿ��. price�� int type
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
