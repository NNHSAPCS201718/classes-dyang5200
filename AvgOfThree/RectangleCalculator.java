import java.util.Scanner;
/**
 * RectangleCalculator
 * 
 * @author Danielle Yang
 * @version 9/28/17
 */
public class RectangleCalculator
{
    private double height;
    private double width;
    
    public RectangleCalculator(double initialHeight, double initialWidth)
    {
        this.height = initialHeight;
        this.width = initialWidth;
    }
    
    public double getArea()
    {
        double area;
        area = height * width;
        return area;
    }
    
    public double getPerimeter()
    {
        double perimeter;
        perimeter = 2 * (height + width);
        return perimeter;
    }
    
    public double getDiagonalLength()
    {
        double diagonalLength;
        diagonalLength = Math.sqrt(Math.pow(height,2) + Math.pow(width,2));
        return diagonalLength;
    }
    
    public String toString()
    {
        String str = ("The rectangle's height is " + height + "" +
            " and its width is " + width + "" + ".");
        String str2 = ("\nThe rectangle's area is " + getArea() + "" +
            " and its perimeter is " + getPerimeter() + "" + " and its diagonal length is "
            + getDiagonalLength() + "" + ".");
        return str + str2;
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double initialHeight, initialWidth;
        System.out.print("What is the height of the rectangle? ");
        initialHeight = s.nextDouble();
        
        System.out.print("What is the width of the rectangle? ");
        initialWidth = s.nextDouble();
        
        RectangleCalculator RecCalc = new RectangleCalculator(initialHeight, initialWidth);
        System.out.println(RecCalc);
    }
}
