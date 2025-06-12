package session_08;
import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		//create a list
		ArrayList<String> mobiles = new ArrayList<String>();
		
		mobiles.add("Samsung s24");
		mobiles.add("One plus 11");
		mobiles.add("Nothing Phone");

		//display the list
		System.out.println("original list:"+mobiles);
	
		//add at specific index
		mobiles.add(1,"Redmi pro");
		System.out.println("After Adding Redmi:"+mobiles);
		
		//update an element
		mobiles.set(2, "CMF");
		System.out.println("After updating CMF :"+mobiles);
		
		//Remove a value or by index also 
		mobiles.remove("One plus 11");
		System.out.println("After removing one plues :"+mobiles);
		
		//Check if the list contains the element 
		System.out.println("contain  Samsung s24: " +mobiles.contains("Samsung s24"));
		
		//Get the size of the list
		System.out.println("Size list: "+mobiles.size());
}
}