package projekt1;

public class ToDoList {

 	public static int antalActions = 0;
	private int nextPosition = 0;
	
	private Item[] itemArray = new Item[100];
	
	public void addItem(Item newItem) {
	itemArray[nextPosition] = newItem;
		++nextPosition;
		++antalActions;
	}	
	
	public Item findItem(String slutdatum) {
		for (int i = 0; i < nextPosition; i++) {
			if (itemArray[i].getSlutdatum().equals(slutdatum)) {
		    return itemArray[i];	
			}   
	}
		return null;
		
	}
	public void listItems() {
		for (Item temp : itemArray) {
			if (temp != null) {
				System.out.println(temp);
			}
		}
	}

	public Item[] getItemArray() {
		return itemArray;
	}

	public void setItemArray(Item[] itemArray) {
		this.itemArray = itemArray;
	}

	public int getAntalActions() {
		return antalActions;
	}
}

