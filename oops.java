//By convention we have to use the starting alphabet in class and small letter in function
class Pen{
    String colour;
    String type;
    public void print(){
        System.out.println("Hello");
    }

    public void printcolor(){
        System.out.println("The colour of the pen is "+this.colour+" and it is "+this.type);
    }
}


class Student{
    String name;
    int age;
    Student(){
        System.out.println("Hellow students how are you doing in your life");
    }
    
    public void info(){
        System.out.println("The name of the student is "+this.name+" and the age is "+age);
    }
}
public class oops {
    public static void main(String args[])
    {
        // object 1
        Pen p1= new Pen();
        p1.colour="red";
        p1.type="ballpen";
        //System.out.println(p1.colour);
        //System.out.println(p1.type);

        //object 2
        Pen p2=new Pen();
        p2.colour="black";
        p2.type="gel pen";

        p2.printcolor();
        p1.printcolor();

        Student s1=new Student();
        s1.name="Prajwal";
        s1.age=23;

        s1.info();

        Student s2=new Student();
    }
    
}
