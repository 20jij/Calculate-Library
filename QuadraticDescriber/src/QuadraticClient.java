//This class contains methods that interact with the user and describe a quadratic function.
//@author JasonJi
//version 10/5/2018
import java.util.*;

public class QuadraticClient {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Quadratic Describer");
		String confirmation = "yes";
		do {
			System.out.println("Provide values foro coefficients a, b, and c");
			System.out.print("a:");
			Scanner console = new Scanner(System.in);
			double a = console.nextDouble();
			System.out.print("b:");
			double b = console.nextDouble();
			System.out.print("c:");
			double c = console.nextDouble();
			System.out.println("Description of the graph of:");
			System.out.println("y = " + a + "x^2" + b + "x" + c);
			System.out.print(Quadratic.quadrDescriber(a,b,c) );
		}
	
		
	

	}

}
