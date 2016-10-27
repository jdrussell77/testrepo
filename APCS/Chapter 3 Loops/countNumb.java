//Jake Russell
//10/12/2016
//count up numbers in big number

import java.util.*;
import java.io.*;


import java.text.NumberFormat;
import java.text.DecimalFormat;


public class countNumb
{


    public static void main (String[] args) throws IOException
    {
       Scanner keyboard = new Scanner(System.in);
       
       String numb;
       int odd, even, zero, i;
       odd = 0;
       even = 0;
       zero = 0;
       
       System.out.print("Enter a number: ");
       numb = keyboard.nextLine();
       
       for(int counter = 0; counter < numb.length(); counter++)
       {     
            i = numb.charAt(counter);
           
            if(i == '1' || i == '3' || i == '5' || i =='7'|| i == '9')
            
                odd++;
            
            if(i == '0')
                
                zero++;
            
            if(i == '2' || i == '4' || i == '6' || i == '8')
            
                even++;
                
          
        }
       
       System.out.println("There are " + odd + " odd numbers in your number.");
       System.out.println("There are " + even + " even numbers in your number.");
       System.out.println("There are " + zero + " zeros in your number.");
       
    }//end of main


}//end of class

