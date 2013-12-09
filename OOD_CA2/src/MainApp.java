import java.util.HashSet;
import java.util.Random;


public class MainApp 
{
	public static void main(String[] args)
	{
		MainApp theApp = new MainApp();
		theApp.start();
	}
	private void start()
	{
		RandomUniqueIDGenerator generator = new RandomUniqueIDGenerator();
		
		
		//task1
		Person p1 = new Person("Ann Jones", "ann@gmail.com", "01-1234567", generator.getPersonID());
		Person p2 = new Person("Mark Reilly", "mark@gmail.com", "01-7894561", generator.getPersonID());
		Person p3 = new Person("Ben Johnson", "ben@gmail.com", "01-1643795", generator.getPersonID());
		Person p4 = new Person("Ken Smaith", "ken@gmail.com", "01-5686289", generator.getPersonID());
		
		DateGenerator addedDate1 = new DateGenerator(28, 11, 2013);
		DateGenerator dueOnDate1 = new DateGenerator(18, 12, 2013);
		DateGenerator completedDate1 = new DateGenerator(21, 12, 2013);
		HashSet<Person> team1 = new HashSet<Person>();
		
		
		Task t1 = new Task("Begin work on GUI desigh for iPhone 6S", generator.getTaskID(), p1, 
				addedDate1, dueOnDate1, Task.Status.ONGOING, Task.NotifyOverdue.NO);
		t1.addMemberToTeam(p2);
		t1.addMemberToTeam(p3);
		t1.addMemberToTeam(p4);
		
		//task2
		Person p5 = new Person("Louis Jones", "lj@gmail.com", "01-6754327", generator.getPersonID());
		Person p6 = new Person("Olivia McGinnees", "om@gmail.com", "01-9860251", generator.getPersonID());
		Person p7 = new Person("Ben Jerry", "benjerry@gmail.com", "02-8763019", generator.getPersonID());
		Person p8 = new Person("Gay Kenydee", "Gayk@gmail.com", "01-5792108", generator.getPersonID());
		
		DateGenerator addedDate2 = new DateGenerator(11, 11, 2013);
		DateGenerator dueOnDate2 = new DateGenerator(11, 12, 2013);
		DateGenerator completedDate2 = new DateGenerator(12, 12, 2013);
		HashSet<Person> team2 = new HashSet<Person>();
		Task t2 = new Task("Begin work on safari test for iPhone 6S", generator.getTaskID(), 
				p5, addedDate2, dueOnDate2, 
				Task.Status.PAUSED, Task.NotifyOverdue.YES);
		t2.addMemberToTeam(p6);
		t2.addMemberToTeam(p7);
		t2.addMemberToTeam(p8);
		
		TaskStore taskStore = new TaskStore("iPhone 6S Task Store");
		taskStore.addTask(t1);
		taskStore.addTask(t2);

		//================================Test Task============================
		//taskStore.printAllTask();	//print all the task
		//taskStore.deleteTask("TSK00002");
		//taskStore.editTask("TSK00002", "HAHAHHA");
		//taskStore.printTask(1);
		//taskStore.printTask("TSK00001");
		//taskStore.editTask("dsdf", "ss");
		
		//taskStore.printAllTask();	//print all the task
		
		//================================Tset Person===========================
		Person p10 = new Person("Louis 11111", "lj@gmail.com", "01-6754327", generator.getPersonID());
		Person p11 = new Person("Louis 22222", "lj@gmail.com", "01-6754327", generator.getPersonID());
		Person p12 = new Person("Louis 33333", "lj@gmail.com", "01-6754327", generator.getPersonID());
		Person p13 = new Person("Louis 44444", "lj@gmail.com", "01-6754327", generator.getPersonID());
		Person p14 = new Person("Louis 55555", "lj@gmail.com", "01-6754327", generator.getPersonID());
		taskStore.addPerson(p10);
		taskStore.addPerson(p11);
		taskStore.addPerson(p12);
		taskStore.addPerson(p13);
		taskStore.addPerson(p14);
		//taskStore.p
		


		
	
	}
}
