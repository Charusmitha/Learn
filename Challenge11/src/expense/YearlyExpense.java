package expense;

import java.util.Scanner;

public class YearlyExpense {
       public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Double total = getTotal();
       print(total);
       }
       public static double getTotal()
       {
    	   string response;
    	   boolean more = true;
    	   while(more)
    	   {
    		   total = getAccmDetail() + getYearDetail();
    		   System.out.println("If more students y/n: ");
    		   response = sc.next();
    		   if((response != 'y') || (response != 'Y'))
    		   {
    			   more = false;
    		   }
    	   }
    	   return total;
       }
       public static double getYearDetail()
       {
    	   String name, year;
    	   Double fee;
    	   System.out.println("Name of the student: ");
    	   name = sc.next();
    	   System.out.println("Year of the student: ");
    	   year = sc.next();
    	   if(year.equalsIgnoreCase("Freshman"))
    	   {
    		   getFreshDetail();
    	   }
    	   else if(year.equalsIgnoreCase("Sophomre"))	
    	   {
    		   getSophDetail();
    	   }
    	   else if(year.equalsIgnoreCase("Junior"))
    	   {
    		   getJunDetail();
    	   }
    	   else if(year.equalsIgnoreCase("Senior"))
    	   {
    		   getSenDetail(); 
    	   }
    	   System.out.println("Name of the student is " +name+ "he/she is a " +year+)
    	   return fee;
       }
       
}
