package controlClasses;
import java.util.ArrayList;



public class Tutor {
	/**
	 * This method allows for the creation of the tutor object that stores all the information about the tutor.
	 */
	private String studentNumber;
	private String name;//the tutors name
	private String password;
	private ArrayList<String> courses;//the courses the tutor can tutor
	private int grade;//the tutors grade
	private Schedule schedule;//the tutors schedule
	private ArrayList<Lesson> lessons;
	private ArrayList<Request> requests;
	private boolean occupied;
	
	public Tutor(String sNum, String n, String pass, ArrayList<String> c, int g, ArrayList<Lesson> l, ArrayList<Request> r)
	{
		studentNumber=sNum;
		name=n;
		password=pass;
		courses=c;
		grade=g;
		lessons=l;
		requests=r;
		occupied =false;
	}

	public String getStudentNumber()
	{
		return studentNumber;
	}
	public String getName()
	{
		return name;
	}
	public boolean verifyPassword(String pass)
	{
		if(pass.equals(password))
			return true;
		return false;
	}
	public ArrayList<String> getCourses()
	{
		return courses;
	}
	public int getGrade()
	{
		return grade;
	}
	public Schedule getSchedule()
	{
		return schedule;
	}
	public ArrayList<Lesson> getLessons()
	{
		return lessons;
	}
	public ArrayList<Request> getRequests()
	{
		return requests;
	}
	public boolean isOccupied()
	{
		return occupied;
	}

	public void setStudentNumber(String sNum)
	{
		studentNumber = sNum;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setPassword(String pass)
	{
		password=pass;
	}
	public void setCourses(ArrayList<String> c)
	{
		courses=c;
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
		grade=g;
	}
	public void setSchedule(Schedule s)
	{
		schedule =s;
	}
	public void addLesson(Lesson l)
	{
		lessons.add(l);
	}
	public void removeLesson(Lesson l)
	{
		lessons.remove(l);
	}
	public void addRequest(Request r)
	{
		requests.add(r);
	}
	public void removeRequest(Request r)
	{
		requests.remove(r);
	}
	public void setOccupied(boolean isOccupied)
	{
		occupied=isOccupied;
	}

	public String toString()
	{
		return "Name: " + name +"/n studentNumber: " +studentNumber + 
				"/n Courses: " + courses.toString() + "/n Lessons: " + lessons.toString() +
				"\n Requests: " + requests.toString() + "\n Occupied: " + occupied;
	}
}
