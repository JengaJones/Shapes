// Importing the math class
import java.lang.Math.*;

public class Cylinder extends Shape {
	
	public static double surface_area() {

		// Creating the variables needed
		double radius = 2;
		double height = 6;
		
		// Running the equation
		return (2 * Math.PI * radius * height) + (2 * Math.PI * (radius * radius));
		
	}
	
	public static double volume() {
		
		// Creating the variables needed
		double radius = 2;
		double height = 6;
		
		// Running the equation
		// Returning the solution
		return Math.PI * (radius * radius) * height;
	}
	
	
	public static void main(String[] args) {
		
		// toString
		System.out.print(Double.toString(surface_area() ));
		System.out.print("\n");
		System.out.print(Double.toString(volume() ));
	}

}
