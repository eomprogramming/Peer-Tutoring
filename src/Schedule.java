public class Schedule {
	/**
	 *This class is for the Schedule object which stores the schedule's of students and tutors. 
	*/
	boolean lunch[];//Whether or not the person is free at lunch
	boolean afternoon[];//Whether or not the person is free after school
	
	//This method is the constructor and allows the schedule to be made
	public Schedule(boolean[] lun, boolean[] aft)
	{
		lunch = lun;
		afternoon = aft;
	}
	
	//return method that returns whether the person is free a certain lunch
	public boolean getLunch(int day)
	{
		return lunch[day];
	}
	
	//return method that returns whether the person is free a certain afternoon
	public boolean getAfternoon(int day)
	{
		return afternoon[day];
	}
	
	//mutator method that changes whether someone is available a certain lunch
	public void setLunch(int dat, boolean available)
	{
		lunch[dat] = available;
	}
	
	//mutator method that returns whether someone is available a certain afternoon
	public void setAfternoon(int dat, boolean available)
	{
		afternoon[dat] = available;
	}
	
	//returns a string of things
	public String toString()
	{
		return "I hope this method isn't important.";
	}
	
	//I'm adding this comment so I can change the commit message :)
}
