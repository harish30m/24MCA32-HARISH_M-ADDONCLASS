package session_08;
import java.util.*;
public class Collectio_Example2 {
public static void main(String[] args) {
	
	/**
	 * Class_Name<>-->Generic class
	 * Method_Name<>()--->Generic Method
	 * 
	 * Interating throught collections
	 * 
	 * 2 ways to iterate
	 * --->using for-each loop
	 * --->using iterator 
	 */
	
	List<String> names = new ArrayList<String>();
	
	names.add("Kamal");
	names.add("Kannan");
	names.add("Dharun");
	names.add("Kesavan");
	
	System.out.println("Using for-each loop");
	//1.Using for-each loop
	for(String name: names) {
		System.out.println(name);
	}
	
	//2.using iterator
	Iterator<String> iterate = names.iterator();
	
	System.out.println("using itrator");
	while(iterate.hasNext()) {
		String name =iterate.next();
		System.out.println(name);
	}
	
}
}
