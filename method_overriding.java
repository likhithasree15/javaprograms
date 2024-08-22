package likitha;

public class method_overriding {
	public static void main(String args[]) {
		bvrit s = new bvrit();
		s.display();
		
	}}
	class cse {
		public void display() {
			System.out.println("Hello");
		}
	}
	class bvrit extends cse{
		public void display() {
			System.out.println("Hyderabad");
		}
	}

