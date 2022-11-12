//A singleton class is a class that can have only one object (an instance of the class) at a time. 
class Singleton{
    //  Declaring a static object of singleton class named instance
    private static Singleton instance;
    // Declaring a static method which is public and return an object of singleton class hence have sme return type.
    public static Singleton getInstance(){
        //If there is no object we will make an object
        if(instance==null){
        instance=new Singleton();
        }
        //Return object anyway
        return instance;
    }
}
public class Main
{
	public static void main(String[] args) {
    /*Appearently we have made two objects but actually these is only a single instance. getInstance is static so it can be called directly
    by class name*/
	  Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
	}
}
