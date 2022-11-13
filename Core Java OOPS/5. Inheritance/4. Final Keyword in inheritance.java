//Final to pevent overriding
//If we add final with function in parent class, compiler will know that this function cananot be overridden at the run time
class shape{
    final void area(){
       System.out.println("This is area"); 
    }
}
class circle extends shape{
    void area(){
        System.out.println("This is Circle area");
    }
}
public class Main
{
	public static void main(String[] args) {
		shape s1=new circle();
		s1.area();
	}
}
//Fianl to prevent inheritance
//If we add final with class then none of it's method can be inherited
final class shape{
    void area(){
       System.out.println("This is area"); 
    }
}
class circle extends shape{
    void area(){
        System.out.println("This is Circle area");
    }
}
public class Main
{
	public static void main(String[] args) {
		shape s1=new circle();
		s1.area();
	}
}
