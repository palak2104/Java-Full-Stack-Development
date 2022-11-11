class Student{
    String name;
    int age;
    static int strength;
    Student(String name,int age){
        this.name=name;
        this.age=age;
        strength++;
    }
}
public class Main
{
	public static void main(String[] args) {
		Student s1=new Student("Palak",21);
		Student s2=new Student("Apoorv",18);
		System.out.println(s1.strength);
	}
}
