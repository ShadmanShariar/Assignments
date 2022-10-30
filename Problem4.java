package assignment;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Circle1's center x- , y-coordinates, and radius : ");
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        
        System.out.print("Enter Circle2's center x- , y-coordinates, and radius : ");
        
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        
        if (r2 >= r1){
        if (distance <= (r2 - 1)) {
            System.out.println("circle1 is inside circle2");
        }
      } 
        else if (r1 >= r2) {
        if (distance <= (r1 - r2)) {
            System.out.println("circle2 is inside circle1");
        }
      } 
        else if (distance > (r1 + r2)) {
        System.out.println("circle2 doesn't overlap circle1");
      } 
        else {
        System.out.println("circle2 overlaps circle1");
      }
        
    }
    
}
