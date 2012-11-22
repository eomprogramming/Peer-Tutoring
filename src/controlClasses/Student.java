package controlClasses;
import java.util.ArrayList;


public class Student {
	
	/**
	 *This mehtod creates the student objects
	 */ 
	private String studentNumber;
	private String name;//the students name
	private String password;
	private ArrayList<String> courses;//the students courses
	private int grade;//the students grade
	private ArrayList<Lesson> lessons;
	
	public Student(String sNum, String n, String pass, ArrayList<String> c, int gr, ArrayList<Lesson> l)
	{
		studentNumber =sNum;
		name=n;
		password=pass;
		courses=c;
		grade=gr;
		lessons=l;
	}

	public String getStudentNumber()
	{
		return(studentNumber);
	}
	public String getName()
	{
		return(name);
	}
	public boolean verifyPassword(String pass)
	{
		if(pass.equals(name))
			return true;
		return false;
	}
	public ArrayList<String>  getCourses()
	{
		return courses;
	}
	public int getGrade()
	{
		return grade;
	}
	public ArrayList<Lesson> getLessons()
	{
		return lessons;
	}

	public void setStudentNumber(String sNum)
	{
		studentNumber = sNum;
	}
	public void setName(String n)
	{
		name =n;
	}
	public void setPassword(String pass)
	{
		password = pass;
	}
	public void setCourses(ArrayList<String> course)
	{
		courses = course;
	}
	public void addCourses(String course)
	{
		courses.add(course);
	}
	public void removeCourses(String course)
	{
		courses.remove(course);
	}
	public void setGrade(int g)
	{
		grade =g;
	}
	public void addLesson(Lesson l)
	{
		lessons.add(l);
	}
	public void removeLesson(Lesson l)
	{
		lessons.remove(l);
	}

	public String toString()
	{
		return "Name: " + name +"/n studentNumber: " +studentNumber + 
				"/n Courses: " + courses.toString() + "/n Lessons: " + lessons.toString();
	}
}
