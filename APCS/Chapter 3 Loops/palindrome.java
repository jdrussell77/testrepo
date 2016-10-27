//Jake Russell
//10/10/2016
//intro 5

import java.util.*;
import java.io.*;


import java.text.NumberFormat;
import java.text.DecimalFormat;


public class palindrome
{


    public static void main (String[] args) throws IOException
    {
       
       Scanner keyboard = new Scanner(System.in);
       String word, newword;
       newword = "";
       
       System.out.print("Enter a word or phrase: ");
       word = keyboard.nextLine();
       
       word = word.replace(" ", "");
       
       for(int i = word.length()-1; i >= 0; i--)
       {     
            newword += word.charAt(i);
          
        }
       if(word.equals(newword))
       
            System.out.println("It is a palindrome.");
       else
       
            System.out.println("It is not a palindrome.");
   
        
    }//end of main


}//end of class

