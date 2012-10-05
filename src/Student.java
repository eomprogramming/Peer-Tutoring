import java.util.ArrayList;


public class Student {
	
	/**
	 *This mehtod creates the student objects
	 */ 
	 String name;//the students name
	String studentCourses[];//the students courses
	int grade;//the students grade
	Schedule schedule;//their schedule
	
	//constructor method that makes the student
	Student(String n, String[] courses, int gr, Schedule sch)
	{
		name = n;
		grade = gr;
		
		studentCourses = courses;
		schedule = sch;
	}
	//returns the students courses
	public String[] getStudentCourses()
	{
		return studentCourses;
	}
	//returns the students grade
	public int getGrade()
	{
		return grade;
	}
	//returns the students schedule
	public Schedule getSchedule()
	{
		return schedule;
	}
	//changes the students name
	public void setName(String n)
	{
		name = n;
	}
	//changes the students courses
	public void setStudentCourses(String[] courses)
	{
		studentCourses= courses;
	}
	//changes the students schedule
	public void setSchedule(Schedule schedule2)
	{
		schedule = schedule2;
	}
	//returns all the things
	public String toString()
	{
		return name + ", " + grade + ", " + studentCourses;
	}

	
}
