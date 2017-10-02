import java.util.Scanner;
/**
 * String Parsing
 *
 * @author Danielle Yang
 * @version 2 October 2017
 */
public class StringParsing
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        str = s.next();
        
        int n = str.length();
        String substring1 = str.substring(0,n-4);
        String substring2 = str.substring(n-3);
        
        System.out.println(substring1 + substring2);
    }
}
