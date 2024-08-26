package programs;
class parent{
	public void display() {
		System.out.println("I am the parent.");
	}
}
class child extends parent{
	public void display() {
		System.out.println("I am the child.");
	}
}
public class Test {
	public static void main(String[] args) {
	parent p = new parent();
	child c = new child();
	p.display();
	c.display();
}
}
