import java.util.Scanner;

//find the first positive number position from user input in array'

public class findFirstPositive {

	public static void main(String[] args) {
		int[] F = new int[16];
		boolean limit = false;
		for(int i=1; i<=15; i++){
			System.out.println("Enter number "+i+" of 15: ");
			F[i]= new Scanner(System.in).nextInt();
		}
	    for(int i = 0; i<F.length;i++){
	        if(F[i]>0&&F[i]%2==0&&limit==false) {  
	        	System.out.println("The postion of the first positive number is in postion: " +i+"\nNumber is: "+F[i]);
	        	limit=true;
	        }
	    }
	}
}