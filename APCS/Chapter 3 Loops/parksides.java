//Jake Russell
//10/17/2016
//parkside's other triangle

import java.util.*;
import java.io.*;


import java.text.NumberFormat;
import java.text.DecimalFormat;


public class parksides
{
    public static void main (String[] args) throws IOException
    {
       
        Scanner cin = new Scanner(System.in);  
         
         System.out.println("Enter: ");
         String[] str = cin.nextLine().split(" ");  
         int N = Integer.valueOf(str[0]).intValue();  
         int S = Integer.valueOf(str[1]).intValue();  
               
         int[][] Tri = new int[N][N];
         
         for(int i = 0; i < tri.length; i++)  
         {  
             for( int j = 0; j < tri.length - 1; j++)  
             {  
                 if(tri[i][j] < 1 || tri[i][j] > 9)  
                     System.out.print(" ");  
                 else  
                     System.out.print(tri[i][j]);  
                 System.out.print(" ");  
                   
             }  
             System.out.println(tri[i][tri.length -1]);  
         }  
               
         for(int j = 0; j < N; j++)  
         {  
             for(int i = 0; i <= j; i++)  
             {  
                 Tri[i][j] = S;  
                   
                 if(S == 9)  
                     S = 1;  
                 else  
                     S++;  
             }  
         }  
          
         print(Tri);  
     }  
}  

