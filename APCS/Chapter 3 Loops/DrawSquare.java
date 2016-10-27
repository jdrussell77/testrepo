//Jake Russell
//10/14/2016
//graphics

import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        StandardPen pen = new StandardPen();
        double th, r, x, y;


        // puts the pen in the pos to start shape
        pen.setColor(Color.red);
        pen.up();
        
        pen.down();
        for(th = 0; th < ( 2*Math.PI); th+= (2*Math.PI)/100)
        {
            r = Math.cos(2 * th);
            x = r * Math.cos(th);
            y = r * Math.sin(th);
            pen.move(x*100,y*100);
        }
        

        
        
        
       
    

    }//end of main
    
}//end of class