import java.text.*;
import java.util.*;
import javax.swing.JSpinner.DateEditor;

public class tickets {
	
	Calendar C = Calendar.getInstance();
	int StandardP = 8; 
	int OAPP = 6;
	int StudentP = 6;
	int ChildP = 4;
	int price = 0;
	int total;
	String TicketType;
	public void prices () throws Exception { 
	
		System.out.println ("Welcome to QA Cinema");
		System.out.println("Please Select a movie");
		
		Scanner moviesl  = new Scanner(System.in);           
		String movie = moviesl.nextLine();
		
		if (movie =="") { System.out.print("Please enter a movie"); 
		Scanner movies_  = new Scanner(System.in); String movie2 = movies_.nextLine();
		}
		
		System.out.println ("You have selected " + movie); System.out.println("Please enter a date in DD-MM-YYYY format");
		Scanner datesel = new Scanner(System.in); String date = datesel.nextLine();
		DateFormat format = new SimpleDateFormat("DD-MM-YYYY", Locale.ENGLISH);
		Date date1 = format.parse(date);
		//C.setTime(date1);
		//int dayOfWeek = C.get(Calendar.DAY_OF_WEEK);
		System.out.println("The date you have selected is " + date);
		System.out.println("Please number of type of ticket you require");
		System.out.println("1. Standard");
	    System.out.println("2. OAP");
	    System.out.println("3. Student");
	    System.out.println("4. Child");

	    System.out.print("Please enter ticket type: ");
	    Scanner tickettypesel  = new Scanner(System.in);           
	    int Ticktype = tickettypesel.nextInt();
	    
	    switch (Ticktype) {
		
		case 1: price = StandardP; TicketType = "Standard"; break;
		case 2: price = OAPP;  	TicketType = "OAP"; 		break; 		
		case 3: price = StudentP; TicketType = "Student"; 	break;
		case 4: price = ChildP;  TicketType = "Child";  	break;
		}	    
	    System.out.print("You have selected a " + TicketType + " Ticket. Price per ticket is £" + price + " Please Enter Quantity");
	    Scanner Q1  = new Scanner(System.in);           
	    int Q1Num = Q1.nextInt();
	    
	    System.out.print("Do you require another type of ticket? Please answer Yes or No");
	    Scanner AdTickets1  = new Scanner(System.in);           
	    String AddTick1 = AdTickets1.nextLine();
	   
	    switch (AddTick1) {
	    case "Yes": total = Q1Num * price;
	    	System.out.print("Please enter ticket type: "); 
	    	Scanner tickettypese2  = new Scanner(System.in); int Ticktype2 = tickettypese2.nextInt();
	    	
	 	    switch (Ticktype2) {
			case 1: price = StandardP;  TicketType = "Standard"; break;
			case 2: price = OAPP; 		TicketType = "OAP"; 	 break; 		
			case 3: price = StudentP; 	TicketType = "Student";  break;
			case 4: price = ChildP; 	TicketType = "Child";  	 break;
			}	
	    	
	    	System.out.print("You have selected a " + TicketType + " Ticket. Price per ticket is £" + price + " Please Enter Quantity");
		    Scanner Q2  = new Scanner(System.in);           
		    int Q2Num = Q2.nextInt();
		    total = (Q2Num*price)+ total;
		    System.out.print("Your total is £" + total);
		    break;
	    case "No":  total = Q1Num * price;
	  	    System.out.print("Your total is £" + total);  }

	   
	}
}
