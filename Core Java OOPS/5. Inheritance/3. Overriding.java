class shape{
    void area(){
       System.out.println("This is area"); 
    }
}
class circle extends shape{
    @Override
    void area(){
        System.out.println("This is Circle area");
    }
}
public class Main
{
	public static void main(String[] args) {
	    /*Dynamic Method Dispatch
	    Java automatically chooses the method of child class rather than parent class
	    as it is resolved at runtime rather than compile time so it overrite automatically*/
		shape s1=new circle();
		s1.area();
		//Output: This is Circle area
	}
}
