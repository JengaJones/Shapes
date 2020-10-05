// Importing the math class
import java.lang.Math.*;

public class Cone {
	
	public static double surface_area() {

		// Creating the variable needed
		double radius = 4;
		double height = 10;
		
		// Running the equation
		return (Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height) ));
		
	}
	
	public static double volume() {
		
		// Creating the variable needed
		double radius = 4;
		double height = 10;
		
		// Running the equation
		// Returning the solution
		return (Math.PI * (radius * radius) * (height / 3) );
	}
	
	
	public static void main(String[] args) {
		
		// toString
		System.out.print(Double.toString(surface_area() ));
		System.out.print("\n");
		System.out.print(Double.toString(volume() ));
	}
	

}
