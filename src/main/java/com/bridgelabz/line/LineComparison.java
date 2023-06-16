package com.bridgelabz.line;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of FIRST line1 ");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Double len1 = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println();
        System.out.println("Enter the Co-ordinates of SECOND line2 ");
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        Double len2 = Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("Length of the first Line1 is : " + len1 + " units" );
        System.out.println("Length of the second Line2 is : " + len2 + " units" );
        System.out.println();
        if(len1.compareTo(len2) == 1)
            System.out.println("Length of Line 1 is GREATER than Line 2 ");
        else if (len1.compareTo(len2) == -1)
            System.out.println("Length of Line 1 is LESS than Line 2 ");
        else
            System.out.println("Both lines are EQUAL in length");
    }
}
