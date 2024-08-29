package likhitha;
class computer{
	public void displayDetails() {
	}
}
  class processor extends computer{
	public void displayDetails() {
		String brand = "micro";
	    int speed = 95;
	    System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
	}
 }

public class jdetails {
	public static void main(String args[]) {
		processor sc = new processor();
		sc.displayDetails();
	}
}

