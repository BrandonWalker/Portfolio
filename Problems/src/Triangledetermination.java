/*
Contract:

Purpose:Determine Triangles type

Example:3,4,5 should be right triangle

 */
package triangledetermination;
import java.util.*;

/**
 *
 * @author brandon
 */
public class Triangledetermination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // new variables
        Double a;
        Double b;
        Double c;
        // Get input and store in variables
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the shortest side of a triangle: ");
        a = in.nextDouble();
        System.out.println("Enter the next shortest side of the triangle: ");
        b = in.nextDouble();
        System.out.println("Enter the longest side of the triangle: ");
        c = in.nextDouble();
        // compare variable values and output correct message
        if(a*a+b*b==c*c)
       System.out.println("Right Triangle");
        else if(a*a+b*b>c*c)
            System.out.println("Acute Trianlge");
        else if(a*a+b*b<c*c)
            System.out.println("Obtuse Triangle");
        
       
       
        
        
        
        
    }
    
}
