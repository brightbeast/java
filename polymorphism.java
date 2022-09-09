class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    
    public void printInfo(int age){
        System.out.println(age);
    }
    
    public void printInfo(String name, int age){
        System.out.println(age+ name);
    }
    public void printInfo(){
        System.out.println("The name and age of the student is "+this.name+this.age);
    }
}

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Student s1=new Student();
		s1.name="Prajwal";
		s1.age=23;
		
		s1.printInfo(s1.name);
		s1.printInfo(s1.age);
		s1.printInfo(s1.name, s1.age);
		s1.printInfo();
	}
}
