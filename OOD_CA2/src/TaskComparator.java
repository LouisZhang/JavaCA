import java.util.Comparator;


public class TaskComparator implements Comparator<Task>
{
		private static byte sortOrder;
		public static final byte SORT_ASCENDING = -1;
		public static final byte SORT_DESCENDING = 1;
		
		private static byte sortType;
		public static final byte SORT_BY_STATUS = 0;
		
		public TaskComparator(byte theSortOrder, byte theSortType)
		{
			sortOrder = theSortOrder;
			sortType = theSortType;
		}

		@Override
		public int compare(Task t1, Task t2) 
		{
			if(t1.getStatus().ordinal() < t2.getStatus().ordinal())
			{
				return -1;
			}
			else if(t1.getStatus().ordinal() > t2.getStatus().ordinal())
			{
				return 1;
			}
			return 0;
		}
		
	}
