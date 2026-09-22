import java.util.Scanner;
public class Logical {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks and attendance  Of Student :");
        double marks=sc.nextDouble();
        double attendance=sc.nextDouble();
        System.out.println("Whether a Student has disciplinary issues(true/false) :");
        boolean disciplinary =sc.nextBoolean();
        System.out.println("Whether a Student has submitted  all assignments (true/false) :");
        boolean assignment=sc.nextBoolean();
        boolean Final_exam= (marks>=40 && attendance >=75 && !disciplinary );
        boolean scholarship=(( (marks>=85 && attendance >=90 )|| (marks>=75 && attendance>=85 && assignment ))&& !disciplinary);
        System.out.println("Eligible for Final Exam : " + Final_exam);

        System.out.println("Eligible for Scholarship : "+ scholarship);



    }
    
}
