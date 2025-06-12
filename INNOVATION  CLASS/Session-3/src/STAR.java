import java.util.Scanner;

public class STAR {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter a number:");
	int n=sc.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(i=n-1;i>=1;i--) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
		}
		
	}
}
