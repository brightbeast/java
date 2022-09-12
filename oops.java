//By convention we have to use the starting alphabet in class and small letter in function
class Student{
    String name;
    int age;
    //non-parameterised constructor
    // Student(){
    //     System.out.println("Hellow students how are you doing in your life");
    // }
    public void info(){
        System.out.println("The name of the student is "+this.name+" and the age is "+age);
    }

    //copy constructor
    Student(Student s)
    {
        this.name=s.name;
        this.age=s.age;
    }

    Student(){
        System.out.println("Blank function");
    }
}
public class oops {
    public static void main(String args[])
    {
        // object 1

        Student s1=new Student();
        s1.name="Prajwal";
        s1.age=23;

        Student s2=new Student(s1);
        s2.info();

    }
    
}
