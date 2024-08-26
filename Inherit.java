package programs;
class A{
	public A() {
		super();
		System.out.println("In A default.");
	}
	public A(int n) {
		super();
		System.out.println("In A parameterized.");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("In B default.");
	}
	public B(int n) {
		this();
		System.out.println("In B parameterized.");
	}
}

public class Inherit {
	public static void main(String[] args) {
	B o = new B(6);
	}
}
