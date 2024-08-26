package programs;
class Details{
	private String name;
	private String designation;
	private int emp_id;
	private String co_name;
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setemp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public void setco_name(String co_name) {
		this.co_name = co_name;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public int getemp_id() {
		return emp_id;
	}
	public String getco_name() {
		return co_name;
	}
}
public class GetterSetter {
	public static void main(String[] args) {
	Details o = new Details();
	o.setName("John");
	o.setDesignation("Manager");
	o.setemp_id(123);
	o.setco_name("Infosys");
	System.out.println(o.getName());
	System.out.println(o.getDesignation());
	System.out.println(o.getemp_id());
	System.out.println(o.getco_name());
	}
}
