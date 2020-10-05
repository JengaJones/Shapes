// Importing the math class
import java.lang.Math.*;


public class Sphere extends Shape {

	public static double surface_area() {

		// Creating the variable needed
		double radius = 4;
		
		// Running the equation
		return (4 * (Math.PI * radius * radius));
		
	}
	
	public static double volume() {
		
		// Creating the variable needed
		double radius = 4;
		
		// Running the equation
		// Returning the solution
		return (4 / 3) * Math.PI * (radius * radius * radius);
	}
	
	
	public static void main(String[] args) {
		
		// toString
		System.out.print(Double.toString(surface_area() ));
		System.out.print("\n");
		System.out.print(Double.toString(volume() ));
	}
	

}
