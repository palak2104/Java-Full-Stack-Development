public class Main
{
    public static class Student{
    String name;
    int roll;
    Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    Student(){
        this("Palak",113);
    }
    }
	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println("Name is "+s.name+" and Roll No is "+s.roll);
	}
}
