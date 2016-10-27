//Jake Russell
//10/14/2016
//graphics

import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class spiral
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        StandardPen pen = new StandardPen();
        double x;
         x = 1;


        // puts the pen in the pos to start shape
        pen.setColor(Color.red);
        pen.up();
        
        pen.down();
        
        for(double i = 0; i < 50; i++)
        {
            pen.move(x);
            x = x+5;
            pen.turn(90);
            pen.move(x);
        }
        

        
        
        
       
    

    }//end of main
    
}//end of class