import java.util.Scanner;


public class simpleDie {
	
	public static void main(String[] args) {
		
		//instantiating new scanner object in order to prompt user to press enter to start game
		Scanner keyIn = new Scanner(System.in);
		//prints the prompt message to the console
		System.out.print("Press enter to roll die");
		keyIn.nextLine();
		
		// attach the roll die method to rolled variable which will be printed to the console. 
		int rolled = dieRoll();
		
		System.out.println("You rolled a " + rolled);
		System.out.println("Play again?");
		// while the user inputs y to the console the game will start over 
		String playAgain = "Y";
		while(playAgain.equalsIgnoreCase("Y")) {
			
		
			//insert break out statement
			//scanner statement to get input
			//variable = scanner result
			Scanner exit = new Scanner(System.in);
			
			
			
			String result = exit.nextLine();
			
			if(result.equalsIgnoreCase(playAgain)) {
				int newRoll = dieRoll();
				System.out.println("You Rolled a " + newRoll);
			}else{
				
				System.out.println("Thanks for playing");}
			
			
			
			
			
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	public static  int dieRoll() {
			int roll = (int) Math.ceil( (int) (Math.random()*6)+ 1);
			return roll;
		}
	
	
	
	

}