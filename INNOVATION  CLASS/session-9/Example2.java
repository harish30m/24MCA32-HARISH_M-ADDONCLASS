package aa;
import java.io.IOException;
import java.io.FileInputStream;

public class Example2 {
public static void main(String[] args) {
	int i;
	char c;
	try(FileInputStream f=new FileInputStream("C:\\Users\\dharu\\OneDrive\\Desktop\\testr.txt")){
		while((i = f.read())!=-1) {
			c=(char)i;//down casting 
			System.out.print(c);
		}
	}
	catch (IOException ex) {
        ex.printStackTrace();
        System.out.println("Error reading file: " + ex.getMessage());
	}}}


