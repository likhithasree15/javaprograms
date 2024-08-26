package programs;

public class MethodOverloading {
	public static int multiply(int x, int y) {
		return x*y;
	}
	public static int multiply(int y) {
		int x = 5;
		return x*y;
	}
	public static double multiply(double x,double y) {
		return x*y;
	}
	public static void main(String[] args) {
		System.out.println(MethodOverloading.multiply(3));
		System.out.println(MethodOverloading.multiply(3,7));
		System.out.println(MethodOverloading.multiply(3.25,4.125));
	}
}
