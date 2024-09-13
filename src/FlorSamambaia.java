
	import java.util.Scanner;

	public class FlorSamambaia {
		
		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int R1 = scanner.nextInt(); 
	        int X1 = scanner.nextInt(); 
	        int Y1 = scanner.nextInt(); 
	        int R2 = scanner.nextInt(); 
	        int X2 = scanner.nextInt(); 
	        int Y2 = scanner.nextInt(); 

	    
	        double distanciaCentros = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

	          if (distanciaCentros + R2 <= R1) {
	            System.out.println("RICO");
	        } else {
	            System.out.println("MORTO");
	        }

	        scanner.close();
	    }
	}
