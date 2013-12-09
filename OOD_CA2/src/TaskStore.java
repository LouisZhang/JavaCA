import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;


public class TaskStore
{
	
	private String name;
	private LinkedList<Task> taskList = new LinkedList<Task>();
	private LinkedList<Person> people = new LinkedList<Person>();
	
	public TaskStore(String name) 
	{
		super();
		this.name = name;
	}
	
	//Add a task to the system. Duplicates are not allowed --- 1
	public void addTask(Task t)
	{
		if(!this.taskList.contains(t))
			this.taskList.add(t);
		else
			System.out.println("This task is already in System.");
	}
	
	//Edit, delete, and print the details of any task.  ----  2
	public void editTask(String taskID, String name)
	{
		Task t = this.getTaskByID(taskID);
		if(t != null)
		{
			t.setName(name);
		}
		else
		{
			System.out.println("Invalid task ID");
		}
		
	}
	/*
	 * delete task given by taskID
	 * String taskID
	 */
	public void deleteTask(String taskID)
	{
		Task t = this.getTaskByID(taskID);
		if(t != null)
		{
			this.taskList.remove(t);
		}
		else
		{
			System.out.println("Invalid task ID");
		}
	}
	
	/*
	 * print one task given by task ID
	 * String taskID
	 */
	public void printTask(String taskID)
	{
		Task t = this.getTaskByID(taskID);
		if(t != null)
		{
			System.out.println(t);
		}
		else
		{
			System.out.println("Invalid task ID");
		}
	}
	
	/*
	 * print task by index
	 * int i
	 */
	public void printTask(int i) 
	{
		if(i >= 0 && i < this.taskList.size())
		{
			System.out.println(this.taskList.get(i));
		}
		else
		{
			System.out.println("Invalid Index Entered");
		}
	} 
	
	/*
	 * get task by taskID
	 * String taskID
	 */
	private Task getTaskByID(String taskID)
	{
		for(Task t: this.taskList)
		{
			if(t.getTaskID().equalsIgnoreCase(taskID))
			{
				return t;
			}
		}
		return null;
	}
	
	/*
	 * print all task
	 */
	public void printAllTask()
	{
		for(Task t: this.taskList)
		{
			System.out.println(t + "\n");
		}
	}
	
	//Add a person to the system.Duplicates are not allowed.
	//ID values are unique and automatically assigned. ----  3
	public void addPerson(Person p)
	{
		if(!this.people.contains(p))
		{
			this.people.add(p);
		}
		else
		{
			System.out.println("Person already exits");
		}
		
	}
	
	//Edit, delete, and print the details of any employee. ---  4
	public void editPersonName(String personID, String name)
	{
		int locationOfPerson = this.getPerson(personID);
		if(locationOfPerson != -1)
		{
			this.people.get(locationOfPerson).setName(name);
		}
		else
		{
			System.out.println("Invalid Personal ID Entered!");
		}
	}
	
	public void editPersonEmail(String personID, String email)
	{
		int locationOfPerson = this.getPerson(personID);
		if(locationOfPerson != -1)
		{
			this.people.get(locationOfPerson).setName(email);
		}
		else
		{
			System.out.println("Invalid Personal ID Entered!");
		}
	}
	
	public void editPersonTel(String personID, String tel)
	{
		int locationOfPerson = this.getPerson(personID);
		if(locationOfPerson != -1)
		{
			this.people.get(locationOfPerson).setName(tel);
		}
		else
		{
			System.out.println("Invalid Personal ID Entered!");
		}
	}
	
	public void deletePerson(String personID)
	{
		int locationOfPerson = this.getPerson(personID);
		if(locationOfPerson != -1)
		{
			this.people.remove(locationOfPerson);
		}
		else
		{
			System.out.println("Invalid Personal ID Entered!");
		}
	}
	
	public void deletePerson(int index)
	{
		if(index >= 0 && index < this.people.size())
		{
			this.people.remove(index);
		}
		else
		{
			System.out.println("Invalid Index Entered!");
		}
	}
	public void deletePerson(Person p)
	{
		if(this.people.contains(p))
		{
			this.people.remove(p);
		}
		else
		{
			System.out.println("Invalid Person Entered!");
		}
	}
	public void printPerson(String personID)
	{
		int locationOfPerson = this.getPerson(personID);
		if(locationOfPerson != -1)
		{
			System.out.println(this.people.get(locationOfPerson).toString());
		}
		else
		{
			System.out.println("Invalid Personal ID Entered!");
		}
	}
	public void printPerson(int index)
	{
		if(index < this.people.size())
		{
			System.out.println(this.people.get(index).toString());
		}
		else
		{
			System.out.println("Invalid Index Entered!");
		}
	}
	
	private int getPerson(String personID)
	{
		for(int i = 0; i < this.people.size(); i++)
		{
			if(this.people.get(i).getPersonId().equalsIgnoreCase(personID))
				return i;
			
		}
		return -1;
	}
	//Print all task details.  ---  5
	
	public void printAllTaskDetails()
	{
		if(this.taskList.size() != 0)
		{
			System.out.println("========All Tasks Detail============\n");
			for(int i = 0; i < this.taskList.size(); i++)
			{
				System.out.println("Task-------------------");
				this.taskList.toString();
				System.out.println("-----------------------");
			}
			System.out.println("\n=======" + this.taskList.size() + " tasks==========");
		}
	}
	//Print all tasks for a user-defined team leader.---6
	
	public void printTasksByLeader(String personID)
	{
		LinkedList<Task> taskByLeader = this.getTasksByLeader(personID);
		if(taskByLeader.size() != 0)
		{
			this.printTasks(taskByLeader);
		}
		else
		{
			System.out.println("No task found!");
		}
		
	}
	
	private LinkedList<Task> getTasksByLeader(String personID)
	{
		LinkedList<Task> temp = new LinkedList<Task>();
		for(Task t: this.taskList)
		{
			if(t.getLeader().getPersonId().equalsIgnoreCase(personID))
			{
				temp.add(t);
			}
		}
		return temp;
		
	}
	
	
	private void printTasks(LinkedList<Task> list)
	{
		if(this.taskList.size() != 0)
		{
			System.out.println("----------Tasks---------\n");
			for(int i = 0; i < list.size(); i++)
			{
				System.out.println("Task-------------------");
				list.toString();
				System.out.println("-----------------------");
			}
			System.out.println("\n--------- " + list.size() + " tasks ----------");
		}
	}
	
	//Return a list of all tasks with a user-defined status. ----- 7
	public LinkedList<Task> getTasksByStatus(Task.Status status)
	{
		LinkedList<Task> temp = new LinkedList<Task>();
		for(Task t: this.taskList)
		{
			if(t.getStatus() == status)
			{
				temp.add(t);
			}
		}
		return temp;
		
	}
	
	//Return a list of all tasks due within a date range. --- 8
	public LinkedList<Task> getTasksByDateRange(DateGenerator startDate, DateGenerator endDate)
	{
		LinkedList<Task> temp = new LinkedList<Task>();
		for(Task t: this.taskList)
		{
			if(t.getDueOnDate().compareTo(startDate) >= 0 && t.getDueOnDate().compareTo(endDate) <= 0)
			{
				temp.add(t);
			}
		}
		return temp;
	}
	// Return a list of all tasks sorted by status. ---- 9
	
	public LinkedList<Task> getSortedTasksByStatus(DateGenerator startDate, DateGenerator endDate)
	{
		LinkedList<Task> temp = new LinkedList<Task>();
		Task smallerTask = this.taskList.get(0);
		for(int i = 1; i < this.taskList.size(); i++)
		{
			if(this.taskList.get(i).getStatus().ordinal() < smallerTask.getStatus().ordinal())
			{
				
			}
		}
		return temp;
	}
	
	// Compare two task stores for equality ---  10
	// Copy a task store (i.e. copy the contents of one store into an empty store). --- 11
	
}
