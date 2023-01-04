package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class School implements IStudent,ITeacher {

	Scanner scan=new Scanner(System.in);
	
	@Override
	public void addTeacher() {
		int id;
		String name;
		String subject;
		int salary;
		
		System.out.println("Teacher Details");
		System.out.println("***************");
		System.out.println("Enter teacher ID: ");
		id=scan.nextInt();
		System.out.println("Enter teacher name: ");
		name=scan.next();
		System.out.println("Enter subject: ");
		subject=scan.next();
		System.out.println("Enter salary: ");
		salary=scan.nextInt();
		TeacherDetails.add(new Teacher(id,name,subject,salary));
	}

	@Override
	public void viewTeacher() {
		System.out.println(TeacherDetails);
		
	}
	
	@Override
	public void addStudent() {
		
		int id,tamil,english,maths,science,history;
		String name,className;
		
		System.out.println("Student Details");
		System.out.println("***************");
		System.out.println("Enter student ID: ");
		id=scan.nextInt();
		System.out.println("Enter student name: ");
		name=scan.next();
		System.out.println("Enter student class: ");
		className=scan.next();
		System.out.println("Enter tamil mark: ");
		tamil=scan.nextInt();
		System.out.println("Enter english mark: ");
		english=scan.nextInt();
		System.out.println("Enter maths mark: ");
		maths=scan.nextInt();
		System.out.println("Enter science mark: ");
		science=scan.nextInt();
		System.out.println("Enter history mark: ");
		history=scan.nextInt();
		StudentData.put(new Student(id,name,className), new Mark(tamil,english,maths,science,history));
	}

	@Override
	public void viewStudent() {
		System.out.println(StudentData);
	}
	
	@Override
	public String getNumberOfStudentsAndTeachers()
	{
		return "Total students: "+School.StudentData.size()+"\nTotal Teachers: "+School.TeacherDetails.size();
	}

	@Override
	public int averageExpense() {
		
		int temp=0;
		List<Integer>  col = new ArrayList<Integer>();
		for(int i=0 ;i< TeacherDetails.size();i++)
		{
		      col.add(TeacherDetails.get(i).salary);
		      temp+=col.get(i);
		}
		return temp/TeacherDetails.size();
	}

	@Override
	public void averageMark() {
	
		Mark mark=new Mark();
		int tamil=0,english=0,maths=0,science=0,history=0;
		
		Set s=StudentData.entrySet();
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mapentry=(Map.Entry)i.next();
			Object obj=mapentry.getKey();
			Mark m=(Mark)mapentry.getValue();
			
			tamil+=m.getTamil();
			english+=m.getEnglish();
			maths+=m.getMaths();
			science+=m.getScience();
			history+=m.getHistory();
		}
		System.out.println("Average of Tamil: "+tamil/StudentData.size());
		System.out.println("Average of English: "+english/StudentData.size());
		System.out.println("Average of Maths: "+maths/StudentData.size());
		System.out.println("Average of Science: "+science/StudentData.size());
		System.out.println("Average of History: "+history/StudentData.size());
	}
}
