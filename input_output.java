import java .util .Arrays ;
import java .util.Scanner;
public class input_output {
    public static void printJava(){
        System.out.println("Hello java how are you ");
    }

    public static void printname(String name)
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        int a=234;
        float pi=3.14F;
        String name="Prajwal";
        char ch='@';// we can't use double inverted commas for char
        System.out.println(ch);
        //concatination'
        String name1="Hello ";
        System.out.println(name1.charAt(0));

        String name2="World";
        System.out.println(name2.substring(0,3));

        String name3=name1+name2;
        System.out.println(name3);

        String newname= name2.replace("Wor","arno");
        System.out.println(newname);
        
        int number=20;
        System.out.println(number);

        number=34;
        System.out.println(number);

        //for non primitive we use "new" keyword

        int[] arr=new int[3];
        arr[0]=3;
        arr[1]=1;
        arr[2]=2;

        System.out.println(arr[2]);
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(arr[2]);

        boolean flag=true;
        System.out.println(flag);
        //2d array
        int[][] statement={{50,60,70}, {80,90,100}};
        System.out.println(statement[1][2]);

        //explicit 
        int product=100;
        int total=product+ (int)18.9;
        System.out.println(total);

        //final(const keyword)
        final float Pi=3.14F;

        //now the value of pi will never change 

        System.out.println(Math.max(5,6));

        System.out.println((int)(Math.random()*10));


        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the age");
        int age=sc.nextInt();
        System.out.println("Your age is "+age);

        Scanner scname= new Scanner(System.in);
        String scnames= scname.next();
        //to include a line we can use scname.nextLine()
        System.out.println("your name is "+scnames);

        printJava();
        printJava();

        printname("Prajwal");
    }
    
}
