import java.util.Scanner;

public class program8_if_else {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = scanner.nextInt();
		
		if((age >= 20) && (age < 30)) {
			System.out.print("you are in 20s\n");
		}
		
		else
			System.out.println("You are not in 20s");
		
		
		scanner.close();
	}

}
