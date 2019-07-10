package compare;
import java.io.*;
public class Compare {
	public static void main(String[] args) throws IOException {
		if(args.length == 2) {
			
			//these are the file streams for file 1 and file 2
			FileInputStream file1 = new FileInputStream(args[0]);
			FileInputStream file2 = new FileInputStream(args[1]);

			
			//two integers for counting bytes
			int i = 0;
			int j = 0;
			//two integers for keeping track of bytes
			int fileSize1 = 0; 
			int fileSize2 = 0; 
			
			
			
			
	        

	        
	        try {
	        	//this while loop reads the first txt file
	        	while((i = file1.read()) != -1) {
	        		fileSize1 += i;
	        	}//this next while loop reads the second txt file
	        	while((j = file2.read()) != -1) {
	        		fileSize2 += j; 
	        	}
	        	//this prints the results of the file reading to the console 
	        	System.out.println("Output: " +args[0]+ " " +args[1] + ":");
	        	if(fileSize1 == fileSize2) {
	        		System.out.println("Identical content" +fileSize1);
	        	}else {
	        		System.out.println("Result:");
	        		//format string 
	        		System.out.println("\tDifferent Content: " + "\n \t\t\tFile1 size:"+ fileSize1+"\n\t\t\tFile2 size:" + fileSize2);
	        	}
	        	
	        }catch(IOException e) {
	        	e.printStackTrace();
	        }
	        
		}else {//this runs if an incorrect number of files are uploading into the console when prompted 
			System.out.println("Incorrect number of files ");
		}
	       
	}
}
