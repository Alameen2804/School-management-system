package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public interface ITeacher {

	List<Teacher> TeacherDetails=new ArrayList<Teacher>();
	
	void addTeacher();
	void viewTeacher();
	String getNumberOfStudentsAndTeachers();
	int averageExpense();
	
}
