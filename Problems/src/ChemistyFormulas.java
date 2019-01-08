import java.util.*;
/*
 * Program to calculate the molarity of user solutions  
 * Brandon Walker
 */
public class ChemistyFormulas {
    public static void main(String[] args) {
    	Map<String, String> molecules = new HashMap<String, String>(); 
        molecules.put("H20", "18.02");
        molecules.put("HCl", "36.46"); 
        molecules.put("Na2SO4", "142"); 
        try(Scanner in = new Scanner(System.in)){
        		System.out.print("input element: ");
        	String input = in.next();
        	String value = molecules.get(input);
        	double solute = Double.parseDouble(value);
        		System.out.print("enter the amount of "+input+" used in grams: ");
        	double substance = in.nextDouble()/solute;
        		System.out.print("enter the amount of water used in mL: ");
        	double water = in.nextDouble()/1000;
        	double answer= substance/water;
        		System.out.print("molarity  of the solution is: "+answer);
        }
    }  
}

