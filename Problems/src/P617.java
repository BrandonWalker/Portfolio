public class P617 {
	/* Mirror Power Sequence Project Euler problem 617
	 * */
	public static void main(String[] args){
		long n = (long)1e18, z = 0; 
		for (int e = (int)(Math.log(n-2) / Math.log(2)); e > 1; e--) { 
			double e1 = 1.0 / e; long a = (long)Math.pow(n, e1); 
			while ((long)Math.pow(a, e) + a > n) a--; z += a - 1; 
			for (int i = 1; (a = (long)Math.pow(n, e1 /= e) - 1) > 0; i++) 
			z += a * (i + i + 1); 	
		}
		System.out.print(z);
	}
}
