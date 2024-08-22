package likitha;
import java.util.Scanner;
public class student_details {
	public static void main(String args[]) {
	System.out.println("Enter  Student details:");
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter Roll No:");
	int x = obj.nextInt();
	obj.nextLine();
	System.out.println("Enter Name:");
    String s = obj.nextLine();
    System.out.println("\nEnter Email:");
    String email = obj.nextLine();
    System.out.println("Roll NO:"+x);
    System.out.println("Name:"+s);
    System.out.println("Email:"+ email);
    
}}
