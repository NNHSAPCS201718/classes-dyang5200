
/**
 * Notes on Strings
 *
 * @author Danielle Yang
 * @version 29 September 2017
 */
public class StringNotes
{
    public static void main(String[] args)
    {
        /*
         * String literal
         *      is an instance of the String class (not a primitive)
         *      delinated by double quotes
         *      must be defined on a single line
         *      
         * "Harry" is a string literal
         */
        
        String name = "Harry"; // equivalent to: new String("Harry");
        
        /*
         * String concatenation
         *      + is the string concatendation operator
         *      concatenates the second string operand to the end of the first
         *          string operand
         *      if one or both operands are Strings, + is the string
         *          concatenation operator (operands are converted to Strings);
         *          otherwise, it is the addition operator
         */
        
        String fName = "Harry";
        String lName = "Potter";
        name = fName + lName; // "HarryPotter"
        name = fName + " " + lName; // "Harry Potter"
        
        String number = "" + 77; // "77"
        String number2 = "" + 7 + 3; // "73" -> order of operations, L to R
        String number3 = 7 + 3 + ""; // "10"
        
        /*
         * length
         *      returns the number of characters in the string
         */
        name = "Harry Potter";
        int length = name.length();   // returns 12
        
        String empty = "";
        length = empty.length();      // returns 0
        
        /*
         * charAt
         *      returns the character (of type char) at the specified
         *          index (0-based, start counting at 0)
         *          
         * H  a  r  r  y
         * 0  1  2  3  4  <- indicies
         * 
         * length = 5     (length = indicies + 1 because index starts at 0)
         */
        
        name = "Harry";
        char start = name.charAt(0);            // returns "H"
        char end = name.charAt(4);              // returns "y"
        end = name.charAt(name.length()- 1);    // returns "y"
        // end = name.charAt(5);                // generates a StringIndexOutOfBoundsException
        
        /*
         * substring
         *      returns part of the string starting at the first index up to,
         *          but not including, the second index
         *      if only one index is specified, returns part of the string
         *          starting at the index through the end of the string
         *      
         * H  e  l  l  o  ,     W  o  r  l  d  !
         * 0  1  2  3  4  5  6  7  8  9 10 11 12
         */
        String greeting = "Hello, World!";
        String sub = greeting.substring(0,5);           // returns "Hello"
        sub = greeting.substring(7,12);                 // returns "World"
        sub = greeting.substring(7);                    // returns "World!"
        sub = greeting.substring(7, greeting.length()); // returns "World!", identical to previous
        
        /*
         * indexOf
         *      returns the index of the first occurrence of the specified
         *          string (where that string FIRST BEGINS)
         *      if not found, returns -1
         *      
         * M  i  s  s  i  s  s  i  p  p  i
         * 0  1  2  3  4  5  6  7  8  9  10
         * 
         * length = 11
         */
        greeting = "Mississippi";
        int index = greeting.indexOf("pp");     // returns 8
        index = greeting.indexOf("ss");         // returns 2
        index = greeting.indexOf("iii");        // returns -1
    }
}
