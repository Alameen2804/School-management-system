package SchoolManagementSystem;

import java.util.HashMap;
import java.util.Map;

public interface IStudent {

	Map<Student,Mark> StudentData=new HashMap<Student,Mark>();
	
	void addStudent();
	void viewStudent();
	void averageMark();
}
