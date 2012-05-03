import java.util.ArrayList;


public class Student {
	String name;
	String studentCourses[];
	int grade;
	Schedule schedule;
	
	Student(String n, String[] courses, int gr, Schedule sch)
	{
		name = n;
		grade = gr;
		
		studentCourses = courses;
		schedule = sch;
	}
	
	public String[] getStudentCourses()
	{
		return studentCourses;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public Schedule getSchedule()
	{
		return schedule;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setStudentCourses(String[] courses)
	{
		studentCourses= courses;
	}
	
	public void setSchedule(Schedule schedule2)
	{
		schedule = schedule2;
	}
	
	public String toString()
	{
		return name + ", " + grade + ", " + studentCourses;
	}

	
}
