/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int cent = Integer.parseInt(args[0]);
		int numq = cent / 25;
		int remainder = cent % 25;
		System.out.println( "Use " + numq + " quarters and " + remainder + " cents");
		// Put your code here
	}
}