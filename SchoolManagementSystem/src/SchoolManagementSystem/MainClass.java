package SchoolManagementSystem;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		School school=new School();
		int choice,i=0;
		while(i==0)
		{
			
			System.out.println("1.Add student details\n"
					+ "2.View student details\n"
					+ "3.Add teacher deatils\n"
					+ "4.View teacher details"
					+ "5.View total number of students and teacher\n"
					+ "6.View average mark in each subject\n"
					+ "7.View average expense\n"
					+ "8.Exit");
			
			System.out.println("Enter your choice: ");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				school.addStudent();
				break;
			case 2:
				school.viewStudent();
				break;
			case 3:
				school.addTeacher();
				break;
			case 4:
				school.viewTeacher();
				break;
			case 5:
				System.out.println(school.getNumberOfStudentsAndTeachers());
				break;
			case 6:
				school.averageMark();
				break;
			case 7:
				System.out.println(school.averageExpense());
				break;
			case 8:
				i=1;
				break;
			}
		}
	}
}