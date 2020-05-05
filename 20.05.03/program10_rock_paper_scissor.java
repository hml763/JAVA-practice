import java.util.Scanner;

public class program10_rock_paper_scissor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Rock Paper Scissor Game. Type in Rock, Paper, Scissor\n\n\nJohn : ");
		String john = scanner.next();
		System.out.print("Mary : ");
		String mary = scanner.next();
		
		if(mary.equals("Scissor")) {
			if(john.equals("Rock"))
				System.out.println("John wins");
			
			else if(john.equals("Paper"))
				System.out.println("Mary wins");

			else if(john.equals("Scissor"))
				System.out.println("Tie");	
			
			else
				System.out.println("Wrong letter");		
		}
		
		else if(mary.equals("Rock")) {
			if(john.equals("Rock"))
				System.out.println("Tie");
				
			else if(john.equals("Paper"))
				System.out.println("John wins");

			else if(john.equals("Scissor"))
				System.out.println("Mary wins");	
			
			else
				System.out.println("Wrong letter");						
		}
		
		else if(mary.equals("Paper")) {
			if(john.equals("Rock"))
				System.out.println("Mary wins");
				
			else if(john.equals("Paper"))
				System.out.println("Tie");

			else if(john.equals("Scissor"))
				System.out.println("John wins");	
			
			else
				System.out.println("Wrong letter");					
		}
		
		else {
			System.out.println("Wrong Letter");
		}
		
		scanner.close();

	}

}
