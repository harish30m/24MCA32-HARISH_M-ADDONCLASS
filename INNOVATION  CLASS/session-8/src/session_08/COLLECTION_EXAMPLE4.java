package session_08;

import java.util.HashMap;
import java.util.Map;

public class COLLECTION_EXAMPLE4 {
public static void main(String[] args) {
	HashMap<Integer, String> codes=new HashMap<Integer, String>();
	
	codes.put(1,"java");
	codes.put(2,"Python");
	codes.put(3,"Nodejs");
	
	for(Map.Entry<Integer, String> entry : codes.entrySet())
	{
		System.out.println("key:" +entry.getKey()+",value:"+entry.getValue());
	}


}
}
