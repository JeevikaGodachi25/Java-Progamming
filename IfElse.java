import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double marks=sc.nextDouble();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }

}
