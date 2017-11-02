package projekt1;

public abstract class Tasks {
	private int id;
	
	private static int nTasks;
	
	public Tasks() {
		nTasks++;
		id= nTasks;
				
	}

	public abstract void print();
	
	@Override
	public String toString() {
		return "id" + id;
		
	}
}
