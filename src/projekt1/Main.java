package projekt1;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("rad 10");
													//		toDoList
		String description;
		int n;
		boolean run = true;
		
		LocalDate today = LocalDate.now();			
		

//		activity 
//		- Time/deadLine
//		 String description;
//		- Time/startTime
//      - int taskID

		Scanner scan = new Scanner(System.in);	
		do {
			System.out.println();
			System.out.println("Hi, today is :");
			System.out.println(today);
			System.out.print ("What to do ? ");
			System.out.println();
			System.out.println();
			System.out.print ("1 = addActivity"); 					
			System.out.println();
			System.out.print ("2 = deleteActivity");				
			System.out.println();
			System.out.print ("3 = editActivity ");					
			System.out.println();
			System.out.print ("4 = checkDeadlineActivity"); // -dagar printas
			System.out.println();
			System.out.print ("5 = removeActivity");				
			System.out.println();
			System.out.print ("6 = searchDeadlineActivity"); //   +/- dagar printas		
			System.out.println();
			System.out.print ("7 = searchDescriptionActivity");	// sök tre första tecken	
			System.out.println();
			System.out.print ("8 = addDay");	//  + 1 dag					
			System.out.println();
			System.out.print ("9 = addWeek");	// + 7 dagar					
			System.out.println();
			System.out.print ("10 = addMonth");	//  + 30 dagar					
			System.out.println();
			System.out.print ("11 = exit");							
			System.out.println();
			System.out.println();
			System.out.println("?=");
			n = scan.nextInt();
			switch (n) {
			case 1:
				System.out.println(n);
				System.out.println();
				break;
			case 2:
				System.out.println(n);
				System.out.println();
				break;			
			case 3:
				System.out.println(n);
				System.out.println();
				break;
			case 4:
				System.out.println(n);
				System.out.println();
				break;	
			case 5:
				System.out.println(n);
				System.out.println();
				break;	
			case 6:
				System.out.println(n);
				System.out.println();
				break;				
			case 7:
				System.out.println(n);
				System.out.println();
				break;	
			case 8:
				System.out.println(n);
				System.out.println();
				today = today.plusDays(1);
				break;	
			case 9:
				System.out.println(n);
				System.out.println();
				today = today.plusDays(7);
				break;	
			case 10:
				System.out.println(n);
				System.out.println();
				today = today.plusDays(30);
				break;	

			default:
				run = false;
			}
		} while (run == true);
		System.out.println("exited");
		System.out.println(today);
		scan.close();
		

	}
}
