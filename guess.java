import java .util .Scanner;
public class guess {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the random number between 10-99 ");
        int b=(int)(Math.random()*100);
        
        while(true)
        {
            int a=input.nextInt();
            if(a==-1)
            {
                System.out.println("End");
                break;
            }
            else if(a>b)
            System.out.println("you guessed the larger number");
            else if(a<b)
            System.out.println("you guessed the smaller number");
            else{
                System.out.println("Congratulations!");
                break;
            }
        }
    }
}
