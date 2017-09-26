
/**
 * Write a description of class DistanceConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DistanceConverter
{
   public static void main(String[] args)
   {
      double yards = 3.5;
      
      final double FEET_PER_YARD = 3;
      final double INCHES_PER_FOOT = 12;
      
      double feet = yards * FEET_PER_YARD;
      double inches = feet * INCHES_PER_FOOT;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}
