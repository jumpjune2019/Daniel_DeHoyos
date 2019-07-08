

public class HeadOrTailTally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //Initialize array and set two of the integers to start at 0
		   int tally[] = {0,0};
		   
		  
		    //create a for loop to simulate 1000 coin flips
		    for (int i = 0; i < 1000; i++) { 
		    	// set the result of the coinGen function to result variable
		    	int result = coinGen();
		        if (result == 1) {
		            tally[0] = tally[0] + 1;
		        } else if(result == 2) {
		        	tally[1] = tally[1] + 1;
		        }
		    } 
		    
		    
		    System.out.println("1000 coin flips");
		    System.out.println("Count of heads:" + tally[0]); 
		    System.out.println("Count of tails:" + tally[1]); 
	}

	public static int coinGen() {
		// TODO Auto-generated method stub
		//create a randomNum variable that creates a number between 1 and 2 
		double randomNum = Math.floor((Math.random()*2)+1);
		//cast the variable to an integer data type
		return (int)randomNum;
	}
	

}
