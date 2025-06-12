package sess;

public class else_if {
	static int age;
public static void main(String[] args) {
	 
	
   
     double ticketPrice;

     if (age < 12) {
         ticketPrice = 50; // Child price
     } else if (age >= 12 && age <= 18) {
         ticketPrice = 70; // Teen price
     } else if (age > 60) {
         ticketPrice = 60; // Senior citizen discount
     } else {
         ticketPrice = 100; // Standard price
     }
     System.out.println("Your ticket price is: Rs" + ticketPrice);
}
}
