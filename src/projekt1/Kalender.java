package projekt1;

import java.util.ArrayList;

public class Kalender {
	
	private String owner; 
    private ArrayList<Tasks> toDoList;
	
    public Kalender(String owner) {
		super();
		this.owner = owner;
		toDoList = new ArrayList<Tasks>();
		toDoList.add(new Creation());
		
		this.toDoList = toDoList;
	}
    
    public void printAll() {
    	for (Tasks t : toDoList) {
    		t.print();
    		
    	}
    }
}
