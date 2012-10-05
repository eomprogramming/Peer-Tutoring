import java.util.ArrayList;


public class Tutor {
	/**
	 * FIRST OF ALL, IAN IS A BIG FAT MEANIE THAT HATES ARTISTIC EXPRESSION. D:<
	 * This method allows for the creation of the tutor object that stores all the information about the tutor.
	 */
	String name;//the tutors name
	ArrayList<String> tutorCourses;//the courses the tutor can tutor
	int grade;//the tutors grade
	Schedule schedule = new Schedule(new boolean[] {}, new boolean[] {});//the tutors schedule
	//this is the constructor method that allows the tutor to be created and all their information set
	Tutor(String n, String[] courses, int gr, Schedule sch)
	{
		name = n;
		tutorCourses = tutorCourses;
		grade = gr;
		schedule = sch;
	}
	//returns the tutors name
	public String getName()
	{
		return name;
	}
	//returns the courses the tutor can tutor
	public ArrayList<String> getTutorCourses()
	{
		return tutorCourses;
	}
	//returns the tutors grade
	public int getGrade()
	{
		return grade;
	}
	//returns the tutors schedule
	public Schedule getSchedule()
	{
		return schedule;
	}
	//changes the tutors name
	public void setName(String n)
	{
		name = n;
	}
	//changes the courses the tutor can tutor
	public void setTutorCourses(ArrayList<String> courses)
	{
		tutorCourses = courses;
	}
	//changes the tutors schedule
	public void setSchedule(Schedule schedule2)
	{
		schedule = schedule2;
	}
	//returns all of the tutors information
	public String toString()
	{
		return name + ", " + grade;
	}
	
}
