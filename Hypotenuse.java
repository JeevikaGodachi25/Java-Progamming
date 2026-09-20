import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        double a ;
        double b ;
        double c ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of side a: ");
        a = sc.nextDouble();
        System.out.println("Enter the length of side b: ");
        b = sc.nextDouble();
        c = Math.sqrt((a * a) +( b * b));
        System.out.println("The hypotenuse of the right triangle is: " + c);
        sc.close();
    }
}
