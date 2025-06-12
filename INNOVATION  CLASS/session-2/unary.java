package sess;

public class unary {
public static void main(String[] args) {
	//negative
//	System.out.println("negative: "+(-a));
//	//positive
//	System.out.println("positive"+(-b));
	int a =1,b=2;
	int c;
	c= a++ + ++a + --a - a-- + b++ + --b - --b + ++b;
	System.out.println(c);
	
}
}
