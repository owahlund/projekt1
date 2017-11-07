package projekt1;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TodoProgram {

	LocalDate today = LocalDate.now();
	ToDoList todoList = new ToDoList();
	public boolean run = true;

	public TodoProgram() {
		todoList.dummyValues();
	}

	public void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("scanner");
		do {
			System.out.println();
			System.out.println("Hi, today is :");
			System.out.println(today);
			System.out.print("What to do ? ");
			System.out.print("1 = addActivity");
			System.out.println();
			System.out.print("2 = deleteActivity");
			System.out.println();
			System.out.print("3 = list ");
			System.out.println();
			System.out.print("4 = checkDeadlineActivity"); // -dagar printas
			System.out.println();
			System.out.print("5 = removeActivity");
			System.out.println();
			System.out.print("6 = searchDeadlineActivity"); // +/- dagar printas
			System.out.println();
			System.out.print("7 = searchDescriptionActivity"); // s�k tre f�rsta tecken
			System.out.println();
			System.out.print("8 = addDay"); // + 1 dag
			System.out.println();
			System.out.print("9 = addWeek"); // + 7 dagar
			System.out.println();
			System.out.print("10 = addMonth"); // + 30 dagar
			System.out.println();
			System.out.print("11 = exit");
			System.out.println();
			System.out.println();
			System.out.println("?=");
			int n = scan.nextInt();
			switch (n) {
			case 1:
				Item fack5 = new Item(5, "Ledig igen  ", "2017-11-22", "2018-01-19");
				todoList.addItem(fack5);
				System.out.println(n);
				System.out.println();
				break;
			case 2:
				System.out.println("Which item Id to delete?");
				
				boolean flag = true;
				int itemToDelete = -1;
				while(flag) {
				try {
				itemToDelete = scan.nextInt();
				flag = false;
				}
				catch(InputMismatchException inp) {
					flag = true;
				}
				}
				
				todoList.removeItem(itemToDelete);
				System.out.println("The result is:");
				todoList.listItems();
				break;
			case 3:
				todoList.listItems();
				break;
			// case 4:
			//
			// Item findItem = ItemArray.findItem("2017-09-22");
			// System.out.println("Deadline passerad f�r aktivitet " + findItem);
			//
			// System.out.println(n);
			// System.out.println();
			// break;
			// case 5:
			// System.out.println(n);
			// System.out.println();
			// break;
			// case 6:
			// System.out.println(n);
			// System.out.println();
			// ItemArray.listItems();
			// // k1.printAll();
			// // Iterator<LocalDate> it1 = deadLineList.iterator();
			// // Better aproach for modify operations
			// // while (it1.hasNext()) {
			// // LocalDate tmpDate = it1.next();
			// // System.out.println(tmpDate);
			// // System.out.println(startTimeList.get(0));
			// // System.out.println(descriptionString.get(0));
			// // }
			// break;
			// case 7:
			// System.out.println(n);
			// System.out.println();
			// break;
			// case 8:
			// System.out.println(n);
			// System.out.println();
			// today = today.plusDays(1);
			// break;
			// case 9:
			// System.out.println(n);
			// System.out.println();
			// today = today.plusDays(7);
			// break;
			// case 10:
			// System.out.println(n);
			// System.out.println();
			// today = today.plusDays(30);
			// break;

			default:
				run = false;
			}
		} while (run == true);
		System.out.println("exited");
		System.out.println(today);
		scan.close();

	}
}
