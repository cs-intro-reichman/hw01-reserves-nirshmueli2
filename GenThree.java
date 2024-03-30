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
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println("The minimum is: "+ min);
	}
}
