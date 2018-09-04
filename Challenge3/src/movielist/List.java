package movielist;

public class List {
     private String movieName;
     private String movieRating;
     private int year;
     private int runTime;
     public List(String movieName, String movieRating, int year, int runTime)  
     {
    	 this.movieName = movieName;
    	 this.movieRating = movieRating;
    	 this.year = year;
    	 this.runTime = runTime;
     }
     public String outString()
     {
    	 return "Movie: " + movieName +
    			 "\nRating: " + movieRating +
    			 "\nRelease year: " + year +
    			 "\nMovie runtime: " + runTime;
     }
}
