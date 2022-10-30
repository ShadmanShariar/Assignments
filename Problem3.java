package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat(".00000");
        
        System.out.println("Enter the temperature in Fahrenheit between -58°F and  41°F : ");
        
        double f = input.nextDouble();
        
        System.out.println("Enter the wind speed (>=2) in miles pere hour : ");
        
        long speed = input.nextLong();
        
        double ans = 35.74 + (0.6215*f) - (35.75*Math.pow(speed,0.16)) + (0.4275*f*Math.pow(speed,0.16));
        
        System.out.println(df.format(ans));
        
        
    }
    
}
