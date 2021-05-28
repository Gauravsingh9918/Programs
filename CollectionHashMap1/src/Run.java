import java.util.HashMap;

public class Run {

	public static void main(String[] args) {
     
		HashMap<String, String> mp=new HashMap<String, String>();
		
		mp.put("Gaurav", "Bangalore");
		mp.put("Shubham", "Pune");
		mp.put("Aniket", "Chennai");
		mp.put("Dinkar", "Ahmedabad");
		mp.put("Saikat", "Kolkata");
		mp.put("Jangala", "Hyderabad");
		
		if(mp.containsKey("Dinkar"))
		{
			System.out.println("Key found");
		}
		else
		{
			System.out.println("Key not found");
		}
	
	}

}
