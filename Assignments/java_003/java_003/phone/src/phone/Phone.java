package phone;

import java.io.*;
import java.util.InputMismatchException;



public class Phone {
	
	public static void main(String args[]) {
		
		String userInput; 
		FileWriter fileOut = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String phoneData[][] = new String[3][5];
		boolean moveOn = true;
		String errorMessage = "Enter a value.";
		
		try {
			
			fileOut = new FileWriter("C:\\java_training\\Assignments\\java_003\\phone\\src\\phone.txt");
			 
			for(int i=0; i < 5; i++) {
				System.out.println("Phone Data Entry App");
				System.out.println("Please enter your name and press enter.");
				
				while (moveOn) {
					try {
						
						phoneData[0][i] = br.readLine();
						moveOn = false;
						if(phoneData[0][i].length() == 0) {
							throw new EmptyInputException(errorMessage);
						}
					}//end of try 
					catch(EmptyInputException e) {
						System.out.println("Please enter a name.");
						moveOn = true;
					}
	
				}// end of while loop
				
				moveOn = true; 
				
				System.out.println("Please enter you phone number and press enter.");
				
				while(moveOn) {
					
					try {
						phoneData[1][i] = br.readLine();
						moveOn = false; 
						if(phoneData[1][i].length() == 0) {
							throw new EmptyInputException(errorMessage);
						}
						
						
						
						
					}catch(EmptyInputException e) {
						System.out.println("ERROR: Please enter a phone number.");
						moveOn = true; 
					}
					
				}// end of 2nd while loop 
				
				moveOn = true; 
				
				System.out.println("Enter your city.");
				
				while(moveOn) {
					try {
						phoneData[2][i]= br.readLine();
						moveOn=false; 
						if(phoneData[2][i].length()==0) {
							throw new EmptyInputException(errorMessage);
						}
					}
					catch(EmptyInputException e) {
						System.out.println("ERROR: Please enter a city name.");
						moveOn=true;
					}
				}// end of 3rd while loop
				
				System.out.println("Current data entered is:");
				System.out.println("\t\tName: " +phoneData[0][i]);
				System.out.println("\t\tPhone Number: " +phoneData[1][i]);
				System.out.println("\t\tCity: " +phoneData[2][i]);
				
				System.out.println("Press any key if correct, (W or w) to restart data entry.");
				
				userInput = br.readLine();
				if(userInput.equalsIgnoreCase("W")) {
					i--;
					
					
				}
				
				
				moveOn = true;
				
			
			}
			
			printToConsole(phoneData);
			printToFile( fileOut , phoneData);
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	} // end of main 
	
	
	public static void printToConsole(String[][] arr) {
		System.out.format("%-20s", "Name");
		System.out.format("%-20s", "Phone");
		System.out.format("%-20s", "City");
		System.out.println();
		
		for(int i=0; i < 5; i++) {
			
			System.out.format("%-20s", arr[0][i]);
			System.out.format("%-20s", arr[1][i]);
			System.out.format("%-20s", arr[2][i]);
			System.out.println();
			
		}//end for loop
	}
	
	public static void printToFile(FileWriter fw, String[][] arr)throws IOException{
		
		fw.write(String.format("%-20s", "Name"));
		fw.write(String.format("%-20s", "Name"));
		fw.write(String.format("%-20s", "Name"));
		
		fw.write(String.format("%-20s", "Name"));
		fw.write(String.format("%-20s", "Name"));		
		fw.write(String.format("%-20s", "Name"));
		
		fw.write("\n");
		
		for(int i=0; i < 5; i++) {
			
			fw.write(String.format("%-20s", arr[0][i]));			
			fw.write(String.format("%-20s", arr[1][i]));			
			fw.write(String.format("%-20s", arr[2][i]));
			
			fw.write("\n");

			
		}//end for loop
		
		fw.flush();
		fw.close();
		
	}

	
	
} // end of Phone class 
