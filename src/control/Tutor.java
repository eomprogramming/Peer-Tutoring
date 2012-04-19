package control;

import java.util.ArrayList;


public class Tutor 
{
	String name;
	ArrayList tutorCourses = new ArrayList<String>();
	int grade;
	Schedule schedule;
	
	public Tutor(String n, String[] courses, int gr, Schedule sch)
	{
		name=n;
		for(int i=0; i<courses.length; i++)
			tutorCourses.add(courses[i]);
		grade=gr;
		schedule=sch;
	}
	public String getName()
	{
		return name;
	}
	public ArrayList<String>  getTutorCourses()
	{
		return tutorCourses;
	}
	public int getGrade()
	{
		return grade;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setTutorCourses(ArrayList<String> courses)
	{
		tutorCourses=courses;
	}
	public void setSchedule(Schedule s)
	{
		schedule=s;
	}
	public String toString()
	{
		String toString = "";
		for(int i=0; i<tutorCourses.size(); i++)
		{
			toString += tutorCourses.get(i);
		}
		return "name:"+name+"\ngrade:"+grade+"\nschedule:"+schedule;
	}
}
