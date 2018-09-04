package Catering;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);  
	public static void main(String[] args) {
		boolean more = true;
		   do{
    	   String type = askType();
    	   String date = askDate();
    	   int NumOfGuests = askGuests();
    	   Event e1 = new Event(type,date,NumOfGuests);
    	   e1.printEvent();
    	   System.out.println("More events? Y/N?: ");
  		   String response = sc.next();
  		   if(response.equalsIgnoreCase("N"))
  		   {
  			 more = false;
  		   }
    	   }while(more);
	}
       public static String askType()
       {
    	  System.out.println("Enter type of event: ");
     	  String type = sc.next();
     	  return type;
       }
       public static String askDate()
       {
    	  System.out.println("Enter date of event: ");
     	  String date = sc.next();
     	  return date;
       }
       public static int askGuests()
       {
    	  System.out.println("Enter number of guests: ");
     	  int NumOfGuests = sc.nextInt();
     	  return NumOfGuests;
       }
}

