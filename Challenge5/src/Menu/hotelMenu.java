package Menu;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class hotelMenu {
	public static void main(String args[]){
		String item;
		double price;
		File infile = new File("Menu.txt");
		File outfile = new File("MenuWithPrices.txt");	
		try
		{
		    Scanner in = new Scanner(infile);
		    Scanner sc = new Scanner(System.in);
			PrintWriter out = new PrintWriter(outfile);
			while(in.hasNextLine())
			{
				item = in.nextLine();
				System.out.println(item);
				System.out.println("Price of the item: ");
				price = sc.nextDouble();
				out.println(item +"\t" +price);			
			}		
			out.close();
			in.close();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("Error encountered: " +e.toString());	
		}
	}	
}


