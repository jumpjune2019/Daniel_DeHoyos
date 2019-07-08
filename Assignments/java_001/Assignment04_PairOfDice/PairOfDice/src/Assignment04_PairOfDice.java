import java.io.IOException;


public class Assignment04_PairOfDice {
	
	public static void main(String[] args) throws IOException {
		
		// this method is invoked to start the game of dice 
		play();
	}
	
	public static  int dieRoller() {
		
		int roll = (int) Math.ceil( (int) (Math.random()*6)+ 1);
		return roll;
	}
	
	public static void printDieRoll() {
		int dieOne = dieRoller();
		int dieTwo = dieRoller();
		
		System.out.println("You have rolled:  ");
		System.out.println("First Die: " +dieOne+ "\n" +
						   "Second Die:" +dieTwo
		);
		
	}
	
	public static void playDice() throws IOException{
		char keyStroke; 
		System.out.print("Press any  key and Enter to throw a pair of dice, or Q and Enter to quit");
		// get user input
		keyStroke = (char) System.in.read();
		
		if(keyStroke == 'Q' || keyStroke == 'q') {
			System.out.println("Thanks for choosing not to play");
		}else {
			//run die roll method 
			printDieRoll(); 
			
			//run lets play again method to continue playing
			letsPlayDiceAgain(); 
		}
	}
	
	public static void letsPlayDiceAgain() throws IOException {
		char keyStroke;
		
		System.out.print("Would you like to play again? (Y or y) and Enter or any other key and enter to Quit");
		
		// read user input
		
		System.in.skip(System.in.available());
		
		keyStroke = (char) System.in.read();
		
		if((keyStroke == 'y')||(keyStroke == 'Y')) {
			printDieRoll();
			
			letsPlayDiceAgain(); 
			
		}else {
			System.out.println("Thank you kindly for playing");
		}
	}

}
