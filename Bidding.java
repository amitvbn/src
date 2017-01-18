import java.util.*;  
import java.text.DecimalFormat;

public class Bidding {

	HashMap<Integer,Integer> horses_bids = new HashMap<Integer,Integer>();  
	LinkedHashMap<Integer,Float> won_horses = new LinkedHashMap<Integer,Float>(); 
	int percentage;
	int total_pool=0;

	public void set_percentage(int percentage){
		this.percentage = percentage;
	}

	public void add_bid(int horse_id, int bid){
		total_pool += bid;
		if(horses_bids.containsKey(horse_id)){
		  bid += horses_bids.get(horse_id);
		}
		horses_bids.put(horse_id, bid);
	}

	public void add_winner(int horse_id){
		won_horses.put(horse_id,(float)horses_bids.get(horse_id));
	}

	public LinkedHashMap<Integer, Float> get_divident(){			
//		System.out.println(total_pool);
//		System.out.println(won_horses.size());
//		System.out.println((1-(float)percentage/100));
		
		DecimalFormat df = new DecimalFormat("#.##");
		float pool_per_winner = total_pool *(1-(float)percentage/100)/won_horses.size();
		for (Map.Entry<Integer, Float> entry : won_horses.entrySet())
		{
			float dividend = pool_per_winner/entry.getValue();
			won_horses.put(entry.getKey(), Float.parseFloat(df.format(dividend)));			  
		}			
		return won_horses;
	}
}