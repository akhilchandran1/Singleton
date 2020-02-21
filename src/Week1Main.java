import java.util.Date;

public class Week1Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Week1Main();
		
	}
	
	public Week1Main() {
		
		// Creating a date object
		Date d1 = new Date(2019,02,04);
		
		// Creating a calendar object
		Calendar calendar = new Calendar();
		
		// Adding an event to the calendar
		calendar.addEvent(d1, "Amilcar's Class");
		
		// Retrieving the event on the date
		System.out.println(calendar.getEvent(d1));
		
		// Creating a date object
		Date d2 = new Date(2019,02,05);
				
		// Adding another event to the calendar
		calendar.addEvent(d2, "Greg's Class");
		
		System.out.println("Generic Calendar");
		// Retrieving all events
		System.out.println(calendar.getEvents());
		
		
	
	}

}
