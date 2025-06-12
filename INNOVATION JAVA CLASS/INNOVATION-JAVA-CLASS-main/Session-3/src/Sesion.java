import java.util.Scanner;

public class Sesion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num:");
	int no=sc.nextInt();
	switch(no){
	case 1:System.out.println("1");
	break;
	case 2:System.out.println("2");
	break;
	case 3:System.out.println("3");
	break;
	case 4:System.out.println("4");
	break;
	default:System.out.println("dharun");
	break;
	
	}
	sc.close();
}
}
