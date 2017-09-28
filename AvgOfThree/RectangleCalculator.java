import java.util.Scanner;
/**
 * RectangleCalculator
 * 
 * @author Danielle Yang
 * @version 9/28/17
 */
public class RectangleCalculator
{
    double height;
    double width;
    double area;
    double perimeter;
    double diagonalLength;
    
    public RectangleCalculator(double initialHeight, double initialWidth)
    {
        this.height = initialHeight;
        this.width = initialWidth;
    }
    
    public double getArea()
    {
        this.area = height * width;
        return area;
    }
    
    public double getPerimeter()
    {
        this.perimeter = 2 * (height + width);
        return perimeter;
    }
    
    public double getDiagonalLength()
    {
        
        return diagonalLength;
    }
    
    // public string toString()
    // {
        // System.out.println("The rectangle's height is " + height +
            // " and its width is " + width + ".");
        // System.out.println("The rectangle's area is " + area +
            // " and its perimeter is " + perimeter + " and its diagonal length is "
            // + diagonalLength + ".");
    // }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double initialHeight, initialWidth;
        System.out.print("What is the height of the rectangle? ");
        initialHeight = s.nextDouble();
        
        System.out.print("What is the width of the rectangle? ");
        initialWidth = s.nextDouble();
    }
}
