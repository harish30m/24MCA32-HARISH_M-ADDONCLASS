package session4;

public class String {
 public static void main(String[] args) {
	/**
	 * String-->non-primitive datatype
	 * It is  immutable(unchangeable)
	 * 
	 * Initialization can be done in 2 ways:
	 * 1.String literal
	 * 2.String object
	 */
	 //1.string literal
	 String name ="kamal";//name -->string reference variable
	 
	 //2.string object
	 String name1 =new String("kamal");
	 
	 char[] ch= {'k','a','m','a','l'};
	 String info = new String(ch);
	 
}
}
