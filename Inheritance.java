package likitha;
class employee{
	int salary = 50;
}
class engineer extends employee{
	int bonus  = 30;
}
public class Inheritance {
	public static void main(String args[]) {
		engineer e1 = new engineer();
		System.out.println("Salary: "+ e1.salary + "\nBonus: " + e1.bonus);
	}
}

