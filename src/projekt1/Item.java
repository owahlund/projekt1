package projekt1;

public class Item {
	
	private String description;
	private String Datum;
	private int id;
	private String slutdatum;
{	
	/*LocalDate today = LocalDate.now();
	LocalDate inFiveDays = today.plusDays(5);
//	LocalDate fiveDaysAgo = today.minusDays(5);
	{	
	Datum = today;
	slutdatum = inFiveDays;*/

	}

public Item(int id,String description, String Datum, String slutdatum) {
	
	this.description = description;
	this.Datum = Datum;
	this.id=id;
	this.slutdatum=slutdatum;
	
}
public String getSlutdatum() {
	return slutdatum;
	
	
}


@Override
public String toString() {
	return " nr " + id +" " + description + " " + "Från "+ Datum + " Till "+ slutdatum;
}
}
