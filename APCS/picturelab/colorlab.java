import java.awt.*;
import java.util.*;
import java.util.List;

public class colorlab
{
    public static void main(String[] args)
    {
        Picture pictObj = new Picture("bookClasses\\images\\beach.jpg");
        pictObj.explore();
        Pixel [] pixels;
        pixels = pictObj.getPixels();
        /*blueify
        for(Pixel pixelObj : pixels)
        {  
            pixelObj.setBlue(255);  
        } 
        pictObj.explore();
        */
       
        /*redify
        for(Pixel pixelObj : pixels)
        {  
            pixelObj.setRed(255);  
        } 
        pictObj.explore();
        */
       
        /*greenify
        for(Pixel pixelObj : pixels)
        {  
            pixelObj.setGreen(255);  
        } 
        pictObj.explore();
        */
       
        /*
        int value;
        for(Pixel pixelObj : pixels)
        {
            value = pixelObj.getBlue();
            
            value = (int) (255 - value);
            
            pixelObj.setBlue(value);
            
            value = pixelObj.getRed();
            
            value = (int) (255 - value);
            
            pixelObj.setRed(value);
            
            value = pixelObj.getGreen();
            
            value = (int) (255 - value);
            
            pixelObj.setGreen(value);
        }
        pictObj.explore();
        */
       
       /* adjustRed
       int value;
       for(Pixel pixelObj : pixels)
        {
            value = pixelObj.getRed();
            
            value = (int) (value * .50);
            
            pixelObj.setRed(value);
        }
        pictObj.explore();
       */
      
      /* adjustGreen
       int value;
       for(Pixel pixelObj : pixels)
        {
            value = pixelObj.getRed();
            
            value = (int) (value * 1.5);
            
            pixelObj.setRed(value);
        }
        pictObj.explore();
       */
      
      /* adjustBlue
       int value;
       for(Pixel pixelObj : pixels)
        {
            value = pixelObj.getRed();
            
            value = (int) (value * .25);
            
            pixelObj.setRed(value);
        }
        pictObj.explore();
       */
      
      /* brighten
      Color color;
      for(Pixel pixelObj : pixels)
        {
            color = pixelObj.getColor();
                 
            color = color.brighter();
            
            pixelObj.setColor(color);
        }
      pictObj.explore();
      */
     
     /* darker
      Color color;
      for(Pixel pixelObj : pixels)
        {
            color = pixelObj.getColor();
                 
            color = color.darke();
            
            pixelObj.setColor(color);
        }
      pictObj.explore();
      */
     
     /*
     int avg;
     for(Pixel pixelObj : pixels)
        {
            
            avg = (int) ((pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3);
            pixelObj.setBlue(avg);
            pixelObj.setRed(avg);
            pixelObj.setGreen(avg);
            
           
        }
      pictObj.explore();
      */
     
     
     
     
      
    }
}
