package programs;

public class This {
	int age;
	String name;
	public This(int age,String name) {
		this.age = age;
		this.name = name;
	}
	public void show() {
		System.out.println("Name: "+name+"\nAge: "+age);
	}
	public static void main(String[] args) {
		This o = new This(18,"Priya");
		o.show();
	}
}
