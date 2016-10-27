//Jake Russell
//9/12/2016
//program 2
//chapter 3 program 2

import java.util.*;

public class ch3_2
{


    public static void main (String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        int year;
        
        System.out.println("Enter a year: ");
        year = keyboard.nextInt();
        
        if((year%4 == 0 && year%100 != 0) || (year%4 == 0 && year%400 == 0))
            
            System.out.println("It is a leap year.");
        if(year%100 == 0 && year%400 != 0)
            
            System.out.println("It is not a leap year.");
        
        
          
           
        



    }


}
