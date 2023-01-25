package comprableandcomperator;

import java.util.Comparator;

public class orderbyfirstname {
	
	public class orederbyname implements Comparator<marksheet>{

		@Override
		public int compare(marksheet m1, marksheet m2) {
			return m1.firstname.compareTo(m2.firstname);
		}

	}		
	}
