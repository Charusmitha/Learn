package bubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
   public static void main(String args[]){
	   int[] num = new int[3];
	   int temp,i,j;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the numbers: ");
	   num[0] = sc.nextInt();
	   num[1] = sc.nextInt();
	   num[2] = sc.nextInt();
	   for(i=0;i<(num.length) - 1;i++)
	   {
		   for(j=0;j<(num.length) - 1 - i;j++)
		   {
			   if (num[j] < num[j+1])
			     {
				   temp = num[j+1];
				   num[j+1] = num[j];
				   num[j] = temp;
				 }
		   }
	   }
	   System.out.println("Sorted array: " +Arrays.toString(num));
}
}
