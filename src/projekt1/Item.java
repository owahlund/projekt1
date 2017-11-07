package projekt1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Item {

	private String description;
	private LocalDate Datum;
	private int id;
	private LocalDate slutdatum;



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDatum() {
		return Datum;
	}

	public void setDatum(LocalDate datum) {
		Datum = datum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSlutdatum(LocalDate slutdatum) {
		this.slutdatum = slutdatum;
	}

	public Item(int id, String description, String Datum, String slutdatum) {
		LocalDate.parse(slutdatum, DateTimeFormatter.ISO_DATE);
		this.description = description;
		this.Datum = LocalDate.now();
		this.id = id;
		this.slutdatum = LocalDate.parse(slutdatum, DateTimeFormatter.ISO_DATE);;

	}

	public LocalDate getSlutdatum() {
		return slutdatum;

	}

	@Override
	public String toString() {
		return " nr " + id + " " + description + " " + "Frånn " + Datum + " Till " + slutdatum;
	}
}
