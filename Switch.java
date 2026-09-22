import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Enter the value  of \'a\'  and \'b\' :" );   
        double a =sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Enter the operator (\'+\',\'-\',\'*\',\'/\') :");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b!=0){
                    System.out.println(a/b);

                }
                else{
                    System.out.println("divisible by zero is not allowed !");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
