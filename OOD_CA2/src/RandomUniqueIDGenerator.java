import java.util.HashSet;
import java.util.Random;


public class RandomUniqueIDGenerator 
{
	private HashSet<Integer> uniquePersonID;
	
	public RandomUniqueIDGenerator()
	{

	}
	
	public String getPersonID()
	{
		String personID = "";
		for(int i = 0; i < 3; i++)
		{
			personID += convertToDigit();
		}
		
		int numberOfID = (int)(Math.random() * 99999);
		for(int a = 10000; a >= 1; a = a/10)
		{
			if(numberOfID / a > 0)
			{
				personID = personID + numberOfID;
				break;
			}
			else
			{
				personID = personID + "0";
			}
		}
		return personID;
	}
	public int getUnique() 
	{
		int num;
		Integer intObj = null;
		do
		{
			num = (int)Math.round(Math.random() * 99999);
			intObj = new Integer(num);
		}while(uniquePersonID.contains(intObj));
		
		uniquePersonID.add(intObj);
		return num;
			
	}
	
	public char convertToDigit()
	{
		Random r = new Random();
		int num = r.nextInt(26) + (byte)'A';
		char c = (char)num;
		
		return c;
		
	}
	
	public String getTaskID()
	{
		String personID = "TSK";
		
		int numberOfID = (int)(Math.random() * 99999);
		for(int a = 10000; a >= 1; a = a/10)
		{
			if(numberOfID / a > 0)
			{
				personID = personID + numberOfID;
				break;
			}
			else
			{
				personID = personID + "0";
			}
		}
		return personID;
	}
}
