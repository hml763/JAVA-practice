import java.util.Scanner;

public class program6_scanner {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		
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
