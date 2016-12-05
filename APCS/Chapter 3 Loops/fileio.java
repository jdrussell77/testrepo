import java.util.*;
import java.io.*;


import java.text.NumberFormat;
import java.text.DecimalFormat;

public class fileio
{
    public static void main (String[] args) throws IOException
    {
       Scanner keyboard = new Scanner(System.in);
       Scanner scanFile = new Scanner(new File ("speaches\\fillmore.txt"));
       String word;
       
       int count_p = 0, count_u = 0, count_o = 0, count_words = 0, count_g = 0;
       
       while(scanFile.hasNext())
       {
           word = scanFile.next();
           count_words ++;
           
           if (word.equalsIgnoreCase("people"))
                count_p++;
           
           if (word.equalsIgnoreCase("united"))
                count_u++;
           
           if (word.equalsIgnoreCase("our"))
                count_o++;
           
           if (word.equalsIgnoreCase("government"))
                count_g++;
           
       }//end of while
       
       System.out.println("United: " + count_u);
       System.out.println("People: " + count_p);
       System.out.println("Our: " + count_o);
       System.out.println("Government: " + count_g);
       System.out.println("There are " + count_words + " words in the speech.");
       
    }
}
