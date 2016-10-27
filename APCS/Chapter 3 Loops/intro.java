//Jake Russell
//9/29/2016
//intro 1 + 2

import java.util.*;
import java.io.*;


import java.text.NumberFormat;
import java.text.DecimalFormat;


public class intro
{


    public static void main (String[] args) throws IOException
    {
        int loop;
        double num, total, avg, count, high, low, range;
        loop = 0;
        total = 0;
        count = 0;
        avg = 0;
        high = 0;
        low = 999999999;
        range = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        while(loop != -9999)
        {
            System.out.println("Enter -9999 to stop.");
            System.out.println("Enter number: ");
            num = keyboard.nextDouble();
            
            if(num == -9999)
                break;
            else
            {   total += num;
            
                count += 1;
            
                avg = total / count;
            }
            
            if(num > high)
                high = num;
            if(num < low)
                low = num;
                
            range = high - low;
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Highest Number: " + high);
        System.out.println("Lowest Number: " + low);
        System.out.println("Range between high and low: " + range);


    }//end of main


}//end of class

