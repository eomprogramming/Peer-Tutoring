
public class Schedule {

	boolean lunch[];
	boolean afternoon[];
	
	public Schedule(boolean[] lun, boolean[] aft)
	{
		lunch = lun;
		afternoon = aft;
	}
	
	public boolean getLunch(int day)
	{
		return lunch[day];
	}
	
	public boolean getAfternoon(int day)
	{
		return afternoon[day];
	}
	
	public void setLunch(int dat, boolean available)
	{
		lunch[dat] = available;
	}
	
	public void setAfternoon(int dat, boolean available)
	{
		afternoon[dat] = available;
	}
	
	public String toString()
	{
		return "I hope this method isn't important.";
	}
}
