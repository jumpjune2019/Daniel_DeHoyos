
import java.io.IOException;

public class Assignment07_GameODice {
	public static void main(String[] args)throws IOException, InterruptedException{
		letsPlayDice();
	}
	
	//generate dice roll
			public static  int dieRoll() {
				int roll = (int) Math.ceil( (int) (Math.random()*6)+ 1);
				return roll;
			}
			
			public static void letsPlayDice() throws IOException, InterruptedException{
				char keyStroke; 
				System.out.println("Welcome to the dice game!");
				System.out.println("Do you feel lucky today? Do ya?");
				
				System.out.print("Press any key and Enter to throw your dice or press Q or q to quit");
				
				// Read user input 
				
				keyStroke = (char) System.in.read();
				
				if(keyStroke == 'q'|| keyStroke == 'Q') {
					System.out.println("See ya later alligator!");
				}else {
					rollDice();
				}
			}
			
			public static String rollDice() throws IOException, InterruptedException {
				String result = "";
				final String COMPUTERLOOSES = "You win!";
				final String COMPUTERLOOSESONTIE = "Damn! You win on a Double! What luck!";
				final String COMPUTERWINSONTIE = "Damn! I win on a double! I pity the fool!";
				final String COMPUTERTIES = "Stalemate! You're tough, let's try for a tie-breaker. Press any key and Enter to throw your dice or Q or q to quit";
				
				int userDiceOne, userDiceTwo, compDiceOne, compDiceTwo, userTotal, compTotal;
				userDiceOne = dieRoll();
				userDiceTwo = dieRoll();
				compDiceOne = dieRoll();
				compDiceTwo = dieRoll();
				userTotal = userDiceOne + userDiceTwo;
				compTotal = compDiceOne + compDiceTwo; 
				
				// options for different types of wins 
				
				System.out.println("Rolling the dice!");
				System.out.println("You have rolled a "+userDiceOne+ "and " + userDiceTwo+ " the" +label(userDiceOne, userDiceTwo));
				System.out.println("I have rolled a " +compDiceOne+ " and" +compDiceTwo+ "the " +label(compDiceOne, compDiceTwo));
				if(userTotal>compTotal) {
					//check type of win by user
					if(userDiceOne == userDiceTwo) {
						System.out.println(COMPUTERLOOSESONTIE);
					}else {
						System.out.println(COMPUTERLOOSES);
					}
					//the program will pause for 10 seconds to allow the user to review the results of the game
					java.util.concurrent.TimeUnit.SECONDS.sleep(10);
					System.out.print("Did you cheat? Gimme another try ,c'mon Press any key and enter to throw dice or q or Q to quit game");
					char keyStroke; 
					
					//read user input 
					
					System.in.skip(System.in.available());
					keyStroke = (char) System.in.read();
					
					if( (keyStroke =='Q')|| (keyStroke == 'q')) {
						System.out.println("Thanks for being a sport! See ya!");
					}else {
						rollDice();
					}
				}else if(userTotal< compTotal) {
					if(compDiceOne == compDiceTwo) {
						System.out.println(COMPUTERWINSONTIE);
						
						//the program will pause for 10 seconds to allow the user to review the results of the game 
						java.util.concurrent.TimeUnit.SECONDS.sleep(10);
						System.out.print("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
						char keyStroke;
						
						//read user input
						
						System.in.skip(System.in.available());
						
						keyStroke = (char) System.in.read();
						
						if((keyStroke == 'Q')|| (keyStroke == 'q')) {
							System.out.println("Thanks for being a good sport! laters!");
						}else {
							rollDice();
						}
						
					}
				}else if(userTotal ==compTotal) {
					System.out.print(COMPUTERTIES);
					//the program will pause for 10 seconds to allow the user to review the results of the game 
					java.util.concurrent.TimeUnit.SECONDS.sleep(10);
					System.out.print("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
					char keyStroke;
					
					//read user input
					
					System.in.skip(System.in.available());
					
					keyStroke = (char) System.in.read();
					
					if((keyStroke == 'Q')|| (keyStroke == 'q')) {
						System.out.println("Thanks for being a good sport! laters!");
					}else {
						rollDice();
					}
					
				}
				return result;
				}
			
			//print label 
			public static String label(int one, int two) {
				String label = "";
				String [][] matrix = {
						{"Snake Eyes","Australian yo","Little Joe From Kokomo","No field five","Easy six","Six one your'are done"},
						{"Ace caught a deuce","Ballerina","the fever","Jimmie Hicks","Benny Blue","Easy Eight"},
						{"Easy four","OJ","Brooklyn Forest","Big Red","Eighter from Decatur","Nina from Pasadena"},
						{"Little Phoebe","Easy six","Skinny McKinney","Square pair","Railroad nine","Big one on the end"},
						{"Sixie from Dixie","Skinny Dugan","Easy eight","Jesse James","Puppy paws","yo"},
						{"The Devil","Easy eight","Lou Brown","Tennessee","Six five no jive","Mignight"}};
					
				if ((one ==1)&&(two==1)) {
					label = matrix[0][0];
					}
				if ((one ==1)&&(two==2)) {
					label = matrix[0][1];
					}
				if ((one ==1)&&(two==3)) {
					label = matrix[0][2];
					}
				if ((one ==1)&&(two==4)) {
					label = matrix[0][3];
					}
				if ((one ==1)&&(two==5)) {
					label = matrix[0][4];
					}
				if ((one ==1)&&(two==6)) {
					label = matrix[0][5];
					}
				if ((one ==2)&&(two==1)) {
					label = matrix[1][0];
					}
				if ((one ==2)&&(two==2)) {
					label = matrix[1][1];
					}
				if ((one ==2)&&(two==3)) {
					label = matrix[1][2];
					}
				if ((one ==2)&&(two==4)) {
					label = matrix[1][3];
					}
				if ((one ==2)&&(two==5)) {
					label = matrix[1][4];
					}
				if ((one ==2)&&(two==6)) {
					label = matrix[1][5];
					}
				if ((one ==3)&&(two==1)) {
					label = matrix[2][0];
					}
				if ((one ==3)&&(two==2)) {
					label = matrix[2][1];
					}
				if ((one ==3)&&(two==3)) {
					label = matrix[2][2];
					}
				if ((one ==3)&&(two==4)) {
					label = matrix[2][3];
					}
				if ((one ==3)&&(two==5)) {
					label = matrix[2][4];
					}
				if ((one ==3)&&(two==6)) {
					label = matrix[2][5];
					}
				if ((one ==4)&&(two==1)) {
					label = matrix[3][0];
					}
				if ((one ==4)&&(two==2)) {
					label = matrix[3][1];
					}
				if ((one ==4)&&(two==3)) {
					label = matrix[3][2];
					}
				if ((one ==4)&&(two==4)) {
					label = matrix[3][3];
					}
				if ((one ==4)&&(two==5)) {
					label = matrix[3][4];
					}
				if ((one ==4)&&(two==6)) {
					label = matrix[3][5];
					}
				if ((one ==5)&&(two==1)) {
					label = matrix[4][0];
					}
				if ((one ==5)&&(two==2)) {
					label = matrix[4][1];
					}
				if ((one ==5)&&(two==3)) {
					label = matrix[4][2];
					}
				if ((one ==5)&&(two==4)) {
					label = matrix[4][3];
					}
				if ((one ==5)&&(two==5)) {
					label = matrix[4][4];
					}
				if ((one ==5)&&(two==6)) {
					label = matrix[4][5];
					}
				if ((one ==6)&&(two==1)) {
					label = matrix[5][0];
					}
				if ((one ==6)&&(two==2)) {
					label = matrix[5][1];
					}
				if ((one ==6)&&(two==3)) {
					label = matrix[5][2];
					}
				if ((one ==6)&&(two==4)) {
					label = matrix[5][3];
					}
				if ((one ==6)&&(two==5)) {
					label = matrix[5][4];
					}
				if ((one ==6)&&(two==6)) {
					label = matrix[5][5];
					}
				
				return label;
			}
			
			
			
}
