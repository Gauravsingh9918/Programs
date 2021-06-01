package cerner;
import java.util.HashMap;
import java.util.Map.Entry;
// count no. of characters using hashmap
public class run {
	static void characterCount(String input)
	{
		HashMap<Character, Integer> charCountMap=new HashMap();
		
		char[] strArray=input.toCharArray();
		for(char c : strArray)
		{
			if (charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);				
			}
			else 
			{
				charCountMap.put(c, 1);
			}
		}
		for (Entry<Character, Integer> entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 		
	}	
	public static void main(String[] args) 
    { 
        String str = "NirmalaConventSenior"; 
        characterCount(str); 
    } 
}
















