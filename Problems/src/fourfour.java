import java.io.*;
public class fourfour {
	public static void main(String[] args){
		/*
		 * Write and execute a program to read a file
		 * of integers from the disk in a file named 
		 * “Problem4.dat” and print them out in order. 
		 * 
		 */
		try{
			FileInputStream s = new FileInputStream("Problem4.dat");
			DataInputStream d = new DataInputStream(s);
			int count = d.readInt();
			int[] a = new int[count];
			for(int i = 0;i<count;i++){
				a[i] = d.readInt();
				System.out.println(a[i]);
			}
			
			s.close();
		}catch(IOException e){
			System.err.println("Exception"+e.toString());
		}
	}
}
