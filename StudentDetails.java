package programs;
import java.util.Scanner;
public class StudentDetails {
	public static void main(String[] args) {
	Scanner o = new Scanner(System.in);
	System.out.println("Enter your roll number:");
	int roll_no = o.nextInt();
	o.nextLine();
	System.out.println("Enter your name:");
	String name = o.nextLine();
	System.out.println("Enter your branch:");
	String branch = o.nextLine();
	System.out.println("Roll number: "+roll_no);
	System.out.println("Name: "+name);
	System.out.println("Branch name: "+branch);
	o.close();
	}
}
