import java.util.ArrayList;


public class Tutor {

	String name;
	ArrayList<String> tutorCourses;
	int grade;
	Schedule schedule = new Schedule(new boolean[] {}, new boolean[] {});
	
	Tutor(String n, String[] courses, int gr, Schedule sch)
	{
		name = n;
		tutorCourses = tutorCourses;
		grade = gr;
		schedule = sch;
	}
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<String> getTutorCourses()
	{
		return tutorCourses;
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
	
	public void setTutorCourses(ArrayList<String> courses)
	{
		tutorCourses = courses;
	}
	
	public void setSchedule(Schedule schedule2)
	{
		schedule = schedule2;
	}
	
	public String toString()
	{
		return name + ", " + grade;
	}
	
}
