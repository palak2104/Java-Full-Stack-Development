/*a nested class can only be accessed by the reference of outer class, where the outer class cannot be static.
Case 1: Nested class is Static
if we need to access the inner static class we do not need the object of outer class, although we still need its reference with object declaration and defination.*/

class outer{
    static class inner{
        String name;
        inner(String name){
            this.name=name;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		outer.inner i=new outer.inner("Palak");
		System.out.println(i.name);
	}
}

/*Case 2: if you want to access the non static inner class in that case we need to attach outer class reference with object declaration and outer class object with new.*/
class outer{
    class inner{
        String name;
        inner(String name){
            this.name=name;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    outer o=new outer();
		outer.inner i=o.new inner("Palak");
		System.out.println(i.name);
	}
}
//How to access functions of inner class
class outer{
    class inner{
    int func(int a,int b){
        return a+b;
    }
    }
}
public class Main
{
	public static void main(String[] args) {
	    outer o=new outer();
	    outer.inner i=o.new inner();
		System.out.println(i.func(3,6));
	}
}
