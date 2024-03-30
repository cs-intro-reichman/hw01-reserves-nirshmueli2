/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x1 = (int)(Math.random()*(b-a) + a);
		int x2 = (int)(Math.random()*(b-a) + a);
		int x3 = (int)(Math.random()*(b-a) + a);
		int min = b;
		if (x1<min){
			min = x1;
		}
		if (x2<min){
			min = x2;
		}
		if (x3<min){
			min = x3;
		}
		System.out.println("out of the numbers " + x1 + " " + x2 + " " + x3);
		System.out.println("the smallest number is " + min);
	// Put your code here
	}
}
