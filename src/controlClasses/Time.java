

public class Time 
{
	private boolean am;
	private int hours;
	private int minutes;
	
	public Time(boolean am, int hours, int minutes)
	{
		this.am = am;
		this.hours = hours;
		this.minutes = minutes;
	}

	public boolean isAm()
	{
            return am;            //am true , pm false

	}
	public int getHours()
	{
		return hours;                  //returns hours
	}
	public int getMinutes()
	{
		return minutes;               //retruns minutes
        }
}