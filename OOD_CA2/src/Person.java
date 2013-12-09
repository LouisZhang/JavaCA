
public class Person 
{
	private String name, email, telephone;
	private String personID;

	public Person(String name, String email, String telephone, String personId)
	{
		super();
		this.name = name;
		this.email = email;
		this.personID = personId;
		this.telephone = telephone;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPersonId() 
	{
		return personID;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getTelephone() 
	{
		return telephone;
	}

	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}

	@Override
	public String toString() 
	{
		return "Name:\t" + name
				+ "ID:\t" + this.getPersonId() 
				+ "Email:\t" + email
				+ "Tel:\t" + telephone;
	}
	
	
	
	
	
	
	
}
