import java.io.*;

public class CopyFile {

	   public static void main(String args[]) throws IOException {  
		   
		   try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			    String line;
			    while ((line = br.readLine()) != null) {
			    	
			    	String[] split = line.split(":");
		        	if(split[0].equals("Bet")){
		        		System.out.println(split[1]) ;
		        		
		        		if(split[0].equals("W")){
		        			
		        		}
		        		else if(split[0].equals("P")){
		        			
		        		}
		        	}
		        	else if(split[0].equals("Result")){
		        		System.out.println(split[1]) ;		        		
		        	}
		        	else{
		        		
		        	}
			    }
			    br.close();
			}
	   }
}