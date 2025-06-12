package session_08;

import java.util.ArrayList;

public class Student_Mangaement {
public static void main(String[] args) {
	ArrayList<Student> students=new ArrayList<>();
	students.add(new Student("dharun", 22));
	students.add(new Student("kamal", 20));
	students.add(new Student("kans", 20));
	for(Student names:students) 
	{
		System.out.println(names);
	}
	


}
}
