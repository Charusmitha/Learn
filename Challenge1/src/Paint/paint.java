package Paint;

import java.util.Scanner;

public class paint {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double length, width, height, surfaceArea, oneGlnArea, glnPaint, lwin, wwin, ldoor, wdoor, winArea, doorArea;
    	int numWin,numDoor;
        System.out.println("The length, width and height of the house is = ");
        length = sc.nextDouble();
        width = sc.nextDouble();
        height = sc.nextDouble();
        System.out.println("Number of windows the house has and its length anf width is = ");
        numWin = sc.nextInt();
        lwin = sc.nextDouble();
        wwin = sc.nextDouble();
        winArea = numWin*lwin*wwin;
        System.out.println("Area of Windows is = " +winArea);
        System.out.println("Number of doors the house has and its length anf width is = ");
        numDoor = sc.nextInt();
        ldoor = sc.nextDouble();
        wdoor = sc.nextDouble();
        doorArea = numDoor*ldoor*wdoor;
        System.out.println("Area of doors is = " +doorArea);
        surfaceArea = ((2*width*height)+(2*height*length))-(winArea+doorArea);
        System.out.println("The surface area of house to be painted is = "+surfaceArea);
        System.out.println("Area covered by 1 gallon of paint is = ");
        oneGlnArea = sc.nextDouble();
        glnPaint = surfaceArea/oneGlnArea;
        System.out.println("Gallons of paint required is = " +glnPaint);
        sc.close();
        
    }
}
