
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("What is our  name: ");
       String name =sc.nextLine();
       System.out.println("How old are you: ");
       int age=sc.nextInt();
       //Avoid Input buffering issue
       sc.nextLine();
       System.out.println("What is Favorite color: ");
       String color=sc.nextLine();
       System.out.println("Hello, " + name + "!");
       System.out.println("You are " + age + " years old.");
       System.out.println("Your favorite color is " + color + ".");
    
    }
    
}
