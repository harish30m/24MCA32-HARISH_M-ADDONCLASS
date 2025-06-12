
public class nested {
public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<1+i;j++) {
//			System.out.print(j);
//			
//		}
//		System.out.println();
//	}
	
	int i,j;
	
	for(i=1;i<=5;i++){
		for(j=1;j<=5-1;j++)
		{
			System.out.print(" ");
			
			
		}
		for(j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
	}
	
}
}
