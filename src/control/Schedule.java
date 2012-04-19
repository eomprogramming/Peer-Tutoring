package control;

public class Schedule
{
	boolean[] lunch;
	boolean[] afternoon;
	
	public static void main (String[] args)	{} // end main method
	
	public Schedule (boolean[] lun, boolean[] aft)
	{
		for (int i = 0; i < lun.length; i++)
			lunch[i] = lun[i];
		
		for (int i = 0; i < aft.length; i++)
			afternoon[i] = aft[i];		
	} // end constructor method
	
	public boolean getLunch (int day)
	{
		return lunch[day];
	} // end getLunch 
	
	public boolean getAfternoon (int day)
	{
		return afternoon[day];
	} // end getAfternoon
	
	public void setLunch (int day, boolean available)
	{
		lunch[day] = available;
	} // end setLunch
	
	public void setAfternoon (int day, boolean available)
	{
		afternoon[day] = available;
	} // end setAfternoon
	
	public String toString()
	{
		String lDaysAvail = "";
		String aDaysAvail  = "";
		
		if (lunch[0])
			lDaysAvail += "Monday, ";
		if (lunch[1])
			lDaysAvail += "Tuesday, ";
		if (lunch[2])
			lDaysAvail += "Wednesday, ";
		if (lunch[3])
			lDaysAvail += "Thursday, ";
		if (lunch[4])
			lDaysAvail += "Friday, ";
		if (lunch[5])
			lDaysAvail += "Saturday, ";
		if (lunch[6])
			lDaysAvail += "Sunday.";
		
		if (afternoon[0])
			aDaysAvail += "Monday, ";
		if (afternoon[1])
			aDaysAvail += "Tuesday, ";
		if (afternoon[2])
			aDaysAvail += "Wednesday, ";
		if (afternoon[3])
			aDaysAvail += "Thursday, ";
		if (afternoon[4])
			aDaysAvail += "Friday, ";
		if (afternoon[5])
			aDaysAvail += "Saturday, ";
		if (afternoon[6])
			aDaysAvail += "Sunday.";
		
		return "Lunches Available: " + lDaysAvail + "\n" +
				"Afternoons Available: " + aDaysAvail;
		
	} // end toString
} // end class
	
