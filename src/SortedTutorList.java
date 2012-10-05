import java.util.ArrayList;


public class SortedTutorList 
{
  final static int NUM_COURSES = 100;
	ArrayList<Tutor> allTutors = new ArrayList<Tutor>();
	@SuppressWarnings("unchecked")
	ArrayList<Tutor> sortedList[][][] = new ArrayList[NUM_COURSES][5][2];
	
	public void addTutor(Tutor t)
	{
		allTutors.add(t);
		for (int i = 0; i<t.getTutorCourses().size(); i++)
		{
			for (int j = 0; j < 5; j++)
			{	sortedList[toInt(t.getTutorCourses().get(i))][j][toInt(t.getSchedule().getLunch(j))].add(t);
				sortedList[toInt(t.getTutorCourses().get(i))][j][toInt(t.getSchedule().getAfternoon(j))].add(t);
			}
		}
	} // end addTutor

	public ArrayList<Tutor> getSuitableTutors(Student s)
	{
		ArrayList<Tutor> suitableTuts = new ArrayList<Tutor>();
		for (int i = 0; i < 5; i++)
		{
			if (s.getSchedule().getLunch(i))
				suitableTuts.addAll(sortedList[toInt(s.getStudentCourse())][i][0]);
			if (s.getSchedule().getAfternoon(i))
				suitableTuts.addAll(sortedList[toInt(s.getStudentCourse())][i][0]);
		} // end loop
				
		return suitableTuts;
	} // end getSuitableTutors
	
	/**
	 * Turn the subject into an int.
	 * @param s
	 * @return
	 */
	public int toInt(String s)
	{
		if (s.equalsIgnoreCase(arg0))
		
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
				
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
																
		else if (s.equalsIgnoreCase(arg0))
																	
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
																		
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
																			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
																								
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
			
		else if (s.equalsIgnoreCase(arg0))
				
		else if (s.equalsIgnoreCase(arg0))
					
		else if (s.equalsIgnoreCase(arg0))
					
		else if (s.equalsIgnoreCase(arg0))
																									
		return 0;
	} // end toInt
	
	/**
	 * Turn availability to int.
	 * @param b
	 * @return
	 */
	public int toInt(boolean b)
	{
		if (b == true)
			return 0;
		else
			return 1;
	} // end toInt 
	
} 
