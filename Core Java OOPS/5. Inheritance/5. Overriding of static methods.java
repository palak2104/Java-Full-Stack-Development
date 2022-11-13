//Static mathods cannot be overridden as overriding is related to objects, and there are no objects associated with static methods. Stattic methods can be inherited
//but cananot be overridden
class shape{
    static void area(){
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
