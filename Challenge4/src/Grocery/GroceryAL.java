package Grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryAL {
       public static void main(String args[]) {
    	   String key = "", groc = "", res = "not found";
    	   Scanner sc = new Scanner(System.in);
    	   ArrayList<String> list = new ArrayList<String>();
    	   list.add("Salt");
    	   list.add("Sugar");
    	   list.add("Rice");
    	   list.add("Bread");
    	   list.add("Coffee");
    	   System.out.println("Current list of groceries:" +list);
    	   System.out.println("Grocery to be found:");
    	   key = sc.next();
    	   for(int i=0;i<=4 && res != "found";i++) 
    	   {
    		  groc = list.get(i);
    		  if (groc.compareTo(key) == 0)
    		  {
    			  res = "found";
    			  System.out.println("Item is already present in the list");
    		  }
    		  else
    		  {
    		  }
    	   }
    	   if (res != "found")	   
    	   {
    		   list.add(5, key);
    		   System.out.println("Final list of groc: " +list);
    	   }
    	   else
    	   {			
    	   System.out.println("Final list of groceries: " +list);
    	   }
    	   sc.close();
       }
}
