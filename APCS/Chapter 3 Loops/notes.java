//********************************************************************
// These are the notes for ch 3 used in hayes class
//********************************************************************
//Jake Russell
//9/29/2016
//ch2 notes
//notes for chap 3

import java.util.*;
import java.io.*;


import java.text.NumberFormat;
import java.text.DecimalFormat;


public class notes
{


    public static void main (String[] args) throws IOException
    {
        int test;
        Scanner keyboard = new Scanner(System.in);
        
        /*System.out.println("Guess my favorite number \n" + "it is between 1-20");
        
        test = keyboard.nextInt();
        
        while(test != -9999)
        {
            if (test == 11)
                System.out.println("it the age of my sons Thomas & Charlie");
            else
                System.out.println("Guess again");
                
        }
        */
        
        /*for(int i = 0, j = 20;; ++i, j--)
        {
            System.out.print("Hi" + i + "\t" + j + "\n");
        }
        
        //System.out.println("After the Loop" + i + "\n");
        */
    
       
       Scanner scanFile = new Scanner(new File ("data\\debate.txt"));
       String word;
       int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0;
       
       while(scanFile.hasNext())
       {
           word = scanFile.next();
           
           count_words ++;
           
           if (word.equalsIgnoreCase("people"))
                count_p++;
           
           /*if (word.equalsIgnoreCase("wrong") || word.equalsIgnoreCase("wrong."))
                count_n++;
           */
           /*if (word.equalsIgnoreCase("china"))
                count_n++;
           */     
           if (word.equalsIgnoreCase("job") || word.equalsIgnoreCase("jobs"))
                count_j++;
           
       }//end of while
       
       System.out.println("Wrong: " + count_n);
       System.out.println("People: " + count_p);
       System.out.println("There are " + count_words + " words in the speech.");
       System.out.println("Job: " + count_j);

    }//end of main


}//end of class

