class Nums{
    int num;
    Nums(int num){
        this.num=num;
    }
    boolean equals(Nums obj){
        return (obj.num==num);
    }
}
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Nums o1=new Nums(12);
		Nums o2=new Nums(12);
		Nums o3=o1;
		//Content is same with different reference
		//Using == will make the condition false
		if(o1==o2) System.out.println("Yes");
		else System.out.println("No");
		//using equals will make the condition true
		if(o1.equals(o2)) System.out.println("Yes");
		else System.out.println("No");
		//Reference is same, hence content is same
		if(o1==o3) System.out.println("Yes");
		else System.out.println("No");
	}
}
