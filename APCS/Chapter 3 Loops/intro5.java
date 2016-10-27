//Jake Russell
//10/10/2016
//intro 5

import java.util.*;
import java.io.*;


import java.text.NumberFormat;
import java.text.DecimalFormat;


public class intro5
{


    public static void main (String[] args) throws IOException
    {
       for(int num = 10; num > 0; num = num - 1)
       {
           for(int space = 0; space < num; space++)
                System.out.print(" ");
                
       } 
       for(int star = 0; star < 10; star++)
       {    System.out.print("*");
            System.out.println();
       }
    }//end of main


}//end of class

