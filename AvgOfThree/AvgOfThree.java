import java.util.Scanner;

public class AvgOfThree
{
   public static void main (String[] args)
   {
      /*
       * A scanner object parses prmitive types and Strings from a stream.
       * 
       * A stream is a sequence of characters from a file, String, keyboard,
       *    network connection
       *    
       * Parsing is separating a sequence of characters into tokens based on
       *    delimiters.
       *    A token is a meaningful sequence of characters (e.g., word)
       *    Delimiters separate tokens (by default, whitespace (space, tab,
       *        new line) is the delimiter).
       * 
       * When we create a Scanner object, we have to specify the input scream
       *    (e.g., System.in which is the keyboard via the terminal window)
       */
       
      Scanner s = new Scanner(System.in);
       double a, b, c;
       
      /*
       * Best practices:
       *    1. prompt the user for what you want them to input
       *    2. use print, not println, so the user input immediately follows
       *        the colon
       *    3. leave a space after teh final colon
       */

      System.out.print ("Enter the first number: ");
      /*
       * The nextDouble method attempts to convert the next token in the stream
       *    to a double and return the value. If the next token cannot be
       *    converted, an exception is generated.
       *    
       * The nextInt method behaves in the same way.
       */
      a = s.nextDouble();

      
      System.out.print ("Enter the second number: ");
      b = s.nextDouble();

      System.out.print ("Enter the third number: ");
      c = s.nextDouble();

      // compute the average of the three numbers

      double avg = (a + b + c) / 3;
      
      System.out.println ("average " + avg);
      
      
      
      System.out.print( "Enter your first name: ");
      
      /*
       * The next method returns the next token in the stream as a String
       */
      
      String firstName = s.next();
      
      /*
       * Call the nextLine method in between calls to next and nextLine to
       *    "consume" the newline character "\n" in the stream.
       */
      s.nextLine();
      
      System.out.print( "Enter your street address: ");
      
      /*
       * The nextLine method returns all characters up to the end of the line
       *    (i.e., where the user typed enter)
       */
      
      String streetAddress = s.nextLine();
      
      System.out.println( "Your name: " + firstName + "\nYour address: " +
            streetAddress );
      // \n is a new line
      
      
   }
}
