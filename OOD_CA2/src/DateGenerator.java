import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateGenerator implements Comparable
{
	private Calendar myDate;
	public DateGenerator(int date, int month, int year)
	{
		this.myDate = Calendar.getInstance();
		this.myDate.set(year, month, date, 9, 0, 0);
	}
	public Calendar getDate() 
	{
		return myDate;
	}
	@Override
	public String toString() 
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateAsStr = dateFormat.format(myDate.getTime());
		return dateAsStr;
	}
	
	@Override
	public int compareTo(Object obj) 
	{
		if(obj == null)
			return 0;
		if(this.getClass() != obj.getClass())
			return 0;
		
		DateGenerator other = (DateGenerator)obj;
		if(this.myDate.before(other.myDate))
			return -1;
		else if(this.myDate.after(other.myDate))
			return 1;
		else
			return 0;
	}
	
	
	
	
}