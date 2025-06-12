
public class ArrayID {

public static void main(String[] args) {
	String[] name= {"Muguilan","Sudhesh","Vasanth"};
//	System.out.println(name[0]);
	
	for(String names :name) {
		
	
	System.out.println(names);	
	}
	int[] no= {1,2,3,4,5}; //Declare and Initalize
	
	int[] number =new int[5];
	number[0]=10;
	number[1]=101;
	number[2]=102;
	number[3]=103;
	number[4]=104;
	for(int num:number){
		System.out.println(num);
	}

	System.out.println();
	//System.out.println(number[0]);
	for(int i=0;i<no.length;i++)
	{
		System.out.println(number[i]);
	}	
}
}
