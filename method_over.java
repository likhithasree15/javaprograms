package likitha;

public class method_over {
	public int sum(int x,int y) {
		return x+y;
	}
    public int sum(int x,int y,int z) {
    	return (x+y+z);
}
public static void main(String args[]) {
	method_over s = new method_over();
	System.out.println(s.sum(5,6));
	System.out.println(s.sum(10,20,30));
	
}
}
