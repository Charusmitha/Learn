package PersonPrac;

import java.util.Scanner;

public class PersonChar {
       public static void main(String args[]){
    	   Scanner sc = new Scanner(System.in);
    	   String name, gender;
    	   double weight, height;
    	   Char person;
    	   System.out.println("Name of the person: ");
    	   name = sc.next();
    	   System.out.println("Gender of the person: ");
    	   gender = sc.next();
    	   System.out.println("Weight of the person in lbs: ");
    	   weight = sc.nextDouble();
    	   System.out.println("Height of the person in cms: ");
    	   height = sc.nextDouble();
    	   person = new Char(name, gender, weight, height);
    	   System.out.println(person.goString());
    	   sc.close();
       }
}