
/**
 * Kevin Hayes
 * Test Picture Classes
 * 
 * @author (Kevin Hayes) 
 * @version (10-19-2016)
 */
public class TestPicture
{

    /**
     * main method, to test the picture
     *  
     */
  public static void main(String[] args)
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
  }
}
