package session_08;

import java.util.HashMap;

public class Countrycodes {
public static void main(String[] args) {
	//Create a map 
	HashMap<Integer, String> countryCodes = new HashMap<Integer, String>();
	
	countryCodes.put(1,"USA");
	countryCodes.put(2,"India");
	countryCodes.put(3,"UK");
	
	//Display the map
	System.out.println("Original Map:"+countryCodes);
	
	//update a value
	countryCodes.put(91,"Bharat");
	System.out.println("After Updating India to Bharat:"+countryCodes);
	
	//remove an entity
	countryCodes.remove(44);
	System.out.println("After removing uk:"+countryCodes);
	
	//check if map contains a key
	System.out.println("Contains key 91?" + countryCodes.containsKey(91));
	
	//Display all keys
	System.out.println("keys" + countryCodes.keySet());
	
	//Display all values
	System.out.println("values"+ countryCodes.values());

	
	
}
}
