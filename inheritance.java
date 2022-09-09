//Inheritance
//multiple inheritance is not possible in java
//1)single 2)multilevel 3)heirarchial 4)hybrid
class Shape{
    String color;
}

class Triangle extends Shape{
   public void printLn(){
    System.out.println(this.color);   
   } 
}

public class Main
{
	public static void main(String[] args) {
		Triangle t1= new Triangle();
		t1.color="Blue";
		t1.printLn();
		
	}
}
