class Box{
    int l,b,h;
    String color="Red";
    Box(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
}
class BoxWeight extends Box{
    int w;
    String color="Yellow";
    BoxWeight(int l,int b,int h,int w){
        super(l,b,h);
        this.w=w;
    }
}
public class Main
{
	public static void main(String[] args) {
	/*Parent pointer can point object of child class but reverse is not possible,as 
	parent have no info about upcoming child classes*/
	Box b1=new BoxWeight(8,9,6,6);
	/*You cannot access the variables only present in child class as it
	depends on the type of pointer*/
	//System.out.println(b1.w);
	/*Color variable is present both in child and parent class but parent is given the priority
	Same goes for C++*/
	System.out.println(b1.color);
	}
}
