package Area;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String reply;
		double pie=3.14;
		int radius;
		double area;
		System.out.println("How are you doing today?");
		reply = s.next();
		System.out.println("What is the radius of the circle?");
		radius=s.nextInt();
		area=pie*radius*radius;
		System.out.println("Good to hear that you are doing " +reply +"\nThe area of circle is " +area);
	}

}
