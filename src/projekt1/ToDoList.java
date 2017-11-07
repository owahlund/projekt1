package projekt1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToDoList {
	private List<Item> itemList = new ArrayList<Item>();

	public void addItem(Item newItem) {
		itemList.add(newItem);
	}

	public void removeItem(int itId) {
		Iterator<Item> it = itemList.iterator();

		while (it.hasNext()) {
			Item i = it.next();
			if (i.getId() == itId) {
				it.remove();
			}

		}

	}

	public Item findItem(String slutdatum) {
		for (int i = 0; i <= itemList.size(); i++) {
			if (itemList.get(i).getSlutdatum().equals(slutdatum)) {
				return itemList.get(i);
			}
		}
		return null;
	}

	public void listItems() {
		for (Item temp : itemList) {
			System.out.println(temp);
		}
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void dummyValues() {
		Item fack1 = new Item(1, "Semester", "2017-10-28", "2017-12-24");
		Item fack2 = new Item(2, "Arbete  ", "2017-08-22", "2017-09-22");
		Item fack3 = new Item(3, "semester", "2017-12-22", "2018-01-01");
		Item fack4 = new Item(4, "Ledig   ", "2017-11-22", "2018-01-19");

		itemList.add(fack1);
		itemList.add(fack2);
		itemList.add(fack3);
		itemList.add(fack4);

	}

}
