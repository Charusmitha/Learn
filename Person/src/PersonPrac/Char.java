package PersonPrac;

public class Char {
       private String name;
       private String gender;
       private double weight;
       private double height;
       public Char(String name, String gender, double weight, double height)
       {
    	   this.name = name;
    	   this.gender = gender;
    	   this.weight = weight;
    	   this.height = height;
       }
       public String getName()
       {
    	   return name;
       }
       public void setName(String value)
       {
    	   name = value;
       }
       public String getGender()
       {
    	   return gender;
       }
       public void setGender(String value)
       {
    	   gender = value;
       }
       public double getWeight()
       {
    	   return weight;
       }
       public void setWeight(double value)
       {
    	   weight = value;
       }
       public double getHeight()
       {
    	   return height;
       }
       public void setHeight(double value)
       {
    	   height = value;
       }
      public String goString()
      {
    	  return "Name: " + name +
    			  "\nGender: " + gender +
    			  "\nWeight: " + weight +
    			  " lbs \nHeigh: " + height + " cms";
      }
}
