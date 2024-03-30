/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given doubleegers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		if (a + b > c &&
				a + c > b &&
				c + b > a) {
			System.out.println("triangle");
		}
		else {
			System.out.println("not triangle");
		}
// Put your code here
	}
}