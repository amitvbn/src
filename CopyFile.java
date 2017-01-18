import java.io.*;
import java.util.*;

public class CopyFile {

	static	HashMap<String,Bidding> bet_objects = new HashMap<String,Bidding>();  			    
	
	   public static void main(String args[]) throws IOException {  
		   
		   try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			    String line;
			    Bidding obj1, obj2;
			    while ((line = br.readLine()) != null) {
			    	
			    	String[] split = line.split(":");
		        	if(split[0].equals("Bet")){
		    	   		if(split[1].equals("W")){
		    	   			new_fn(split, "W", 15);
		        		}
		        		else if(split[1].equals("P")){
		        			new_fn(split, "P", 12);
		        		}
		        	}
		        	else if(split[0].equals("Result")){
		        			obj1 = bet_objects.get("W");
		        			obj1.add_winner(Integer.parseInt(split[1]));
		        			
		        			obj2 = bet_objects.get("P");
		        			obj2.add_winner(Integer.parseInt(split[1]));
		        			obj2.add_winner(Integer.parseInt(split[2]));
		        			obj2.add_winner(Integer.parseInt(split[3]));
		        			
		        			System.out.println(obj1.get_divident());
		        			System.out.println(obj2.get_divident());
		        	}
			    }
			    br.close();
			}
	   }
	   
	   public static void new_fn(String[] split, String bid_type, int percentage){
		   
		   		Bidding obj;
	   			if(bet_objects.containsKey(bid_type)){
	   				obj = bet_objects.get(bid_type);
	   			}
	   			else{
	   				obj = new Bidding();
	   				bet_objects.put(bid_type,obj);
	   				obj.set_percentage(percentage);
	   			}
	   			obj.add_bid(Integer.parseInt(split[2]), Integer.parseInt(split[3]));
	   }
}