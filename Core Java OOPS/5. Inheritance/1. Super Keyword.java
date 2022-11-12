//The super keyword in Java is a reference variable which is used to refer immediate parent class object.
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
        //Here super will call the cunstructor of the parent class
        super(l,b,h);
        this.w=w;
    }
    void showColor(){
      System.out.println("The color of parent box is "+super.color);
      System.out.println("The color of this box is "+color);
    }
}
public class Main
{
	public static void main(String[] args) {
	  BoxWeight bw=new BoxWeight(3,6,9,5);
		System.out.println(bw.l);
		System.out.println(bw.b);
		System.out.println(bw.h);
		System.out.println(bw.w);
    bw.showColor();
	}
}
