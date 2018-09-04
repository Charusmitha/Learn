package HospitalCharges;

import java.util.Scanner;

public class hospitalCharges {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double ONC,MC,LSC,TC,NOD,NON,NOP;
		String Ans = "";
		do{
			System.out.println("No. of days at hospital:");
			NOD = in.nextInt();
			System.out.println("No. of nights at hospital:");
			NON = in.nextInt();
			if (NON == 0)
			{
				System.out.println("Medical Charges and Lab service charges are:");
				MC = in.nextDouble();
				LSC = in.nextDouble();
				TC = NOD * (MC+LSC);
				System.out.println("Total charges = " +TC);
			}
			else
			{
				System.out.println("Overnight charges, Medical charges and Lab service charges are:");
				ONC = in.nextDouble();
				MC  = in.nextDouble();
				LSC = in.nextDouble();
				TC = NON * (ONC+MC+LSC) + NOD * (MC+LSC);
				System.out.println("Total charges = " +TC);
			}
			System.out.println("More patients?");
			Ans = in.next();
		  } while(Ans.equalsIgnoreCase("y"));
		}
		
	}
	

