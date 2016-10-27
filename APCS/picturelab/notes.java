

/**
 * Write a description of class notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List;

public class notes
{
    public static void main(String[] args)
    {
        Picture pictObj = new Picture("bookClasses\\images\\beach.jpg");
        Picture pictObj1 = new Picture("bookClasses\\images\\beach.jpg");
        //pictObj.explore();
        int[] numbers = new int[10];
        System.out.println(numbers[5] + "-1");
        Pixel [] pixels;
        pixels = pictObj.getPixels();
        System.out.println(pixels.length);
        System.out.println(pixels[17]);
        System.out.println(pixels[17].getColor());
        pixels[17].setColor(Color.blue);
        pixels[20].setColor(new Color(255,255,0));
        
        pictObj.explore();
        
        //for(Pixel pixelObj : pixels)
        //{  
        //    pixelObj.setGreen(0);
        //    pixelObj.setRed(0);
        //}
        
        int value;
        final double FACTOR = 1.3;
            for(Pixel pixelObj : pixels)
            {
                value = pixelObj.getBlue();
                
                value = (int) (value * pixels);
                
                pixelObj.setBlue(value);
                
                value = pixelObj.getGreen();
                
                value = (int) (value * pixels);
                
                pixelObj.setGreen(value);
                
                value = pixelObj.getRed();
                
                value = (int) (value * pixels);
                
                pixelObj.setRed(value);
            }
        
        
        
        
        
       pictObj.explore();
        
        //for(Pixel spot : pixels)
        //System.out.println(spot);
        
        //for(int i = 0; i < pixels.length; i++)
        //    System.out.println(pixels[i].getRed());
       
        
        //pictObj1.explore();
        Color color2 = new Color(45,233,233);
        pixels = pictObj1.getPixels();
        Color color;
        for(Pixel pixelObj : pixels)
        {
            color = pixelObj.getColor();
            color2 = new Color((int)(Math.random()*255),
                                (int)(Math.random()*255),
                                (int)(Math.random()*255));
                                
            color = color.brighter();
            
            pixelObj.setColor(color2);
        }
        
        //pictObj1.explore();
            
        
        
        
        
        
        
        
        
        
        
        
        
    
    }

}
