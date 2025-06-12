package sess;

import java.util.Scanner;

public class data_collect {
 public void method(){
	Scanner sc=new Scanner(System.in); 
	System.out.print("enter Your name:");
	String name=sc.nextLine();
	System.out.print("enter Your age:");
	int age=sc.nextInt();
	System.out.print("enter Your weight:");
	double weight=sc.nextDouble();
	System.out.print("enter Your location:");
	String location=sc.next();
	System.out.print("enter Your exp:");
	float exp=sc.nextFloat();
	System.out.println("Your name: " + name+ " Your age: " +age
			+" Your Weight "+weight +" Your location: " + location + " Your exp: "
			+ exp);

	sc.close();
		
}
}
