import java.util.Scanner;

public class program6_scanner {

	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Your name is " + name);
		
		String city = scanner.next();
		System.out.println("Your city is " + city);
		
		int age = scanner.nextInt();
		System.out.println("Your age is " + age);
		
		double weight = scanner.nextDouble();
		System.out.println("Your weight is " + weight);
		
		boolean single = scanner.hasNextBoolean();
		System.out.println("Your singularity is " +  single);
		
		
	}
	
}
