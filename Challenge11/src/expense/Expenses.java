package expense;

import java.util.Scanner;

public class Expenses {
	 private static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
    	 boolean more = true;
    	 double accmFee;
    	 double fee;
    	 double total;
    	 while(more)
    	 {
    		 System.out.println("Enter name of the student: ");
    		 String name = in.next();
    		 accmFee = getAccmFee(getAccm());
    		 fee = getFee(getYear());
    		 total = accmFee + fee;
    		 print(total,name);
    		 System.out.println("More Students? Y/N?: ");
    		 String response = in.next();
    		 if(response.equalsIgnoreCase("N"))
    		 {
    			 more = false;
    		 }
    	 } 
     }
     public static String getAccm()
     {
    	 System.out.println("Enter type of accomodation: ");
    	 String accm = in.next();
    	 return accm;
     }
     public static double getAccmFee(String value)
     {
    	 double accmFee = 0;
    	 if(value.equalsIgnoreCase("Commuting"))
    	 {
    		 System.out.println("Enter weekly charges for commute: ");
    		 double commChargeWeekly = in.nextDouble();
    		 System.out.println("Enter no. of weeks of commute: ");
    		 int commWeeks = in.nextInt();
    		 accmFee = commChargeWeekly * commWeeks;
    		 System.out.println("Yearly charges for accomadation type " +value+ " is: " +accmFee);
    	 }
    	 else if(value.equalsIgnoreCase("Apartment"))
    	 {
    		 System.out.println("Enter weekly charges for commute: ");
    		 double commChargeWeekly = in.nextDouble();
    		 System.out.println("Enter no. of weeks of commute: ");
    		 int commWeeks = in.nextInt();
    		 System.out.println("Enter no. of weeks of stay: ");
    		 int numWeeks = in.nextInt();
    		 System.out.println("Enter weekly charges of stay: ");
    		 double stayCharge = in.nextDouble();
    		 accmFee = (commChargeWeekly * commWeeks) + (numWeeks * stayCharge); 
    		 System.out.println("Yearly charges for accomadation type " +value+ " is: " +accmFee);
    	 }
    	 else if(value.equalsIgnoreCase("OnCampus"))
    	 {
    		 System.out.println("Enter no. of weeks of stay: ");
    		 int numWeeks = in.nextInt();
    		 System.out.println("Enter weekly charges of stay: ");
    		 double stayCharge = in.nextDouble();
    		 System.out.println("Enter cost of room and board: ");
    		 double roomBoard = in.nextDouble();
    	     accmFee = (numWeeks * stayCharge) + roomBoard;
    		 System.out.println("Yearly charges for accomadation type " +value+ " is: " +accmFee);
    	 }
    	 return accmFee;
     }
     public static String getYear()
     {
    	 System.out.println("Enter year of study: ");
    	 String year = in.next();
    	 return year;
     }
     public static double getFee(String studYear)
     {
         System.out.println("Enter cost of supplies for a whole year: ");
    	 double costSupplies = in.nextDouble();
    	 System.out.println("Enter no. of credit hours: ");
    	 double creditHours = in.nextDouble();
    	 System.out.println("Enter cost per credit hour: ");
    	 double costCredit = in.nextDouble();
     	 double fee = (creditHours * costCredit) + costSupplies;
    	 System.out.println("Total fee for " +studYear+ " is: " +fee);
    	 return fee;
     }
     public static void print(double total, String name)
     {
    	 System.out.println("Total yearly expenses of " +name+ " is: " +total);
     }
}
