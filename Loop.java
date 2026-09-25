import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int[] num= new int[n];
        System.out.println("Enter the Elemnets :");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Array Elements :");
        for(int i=0;i<n;i++){
           System.out.print(num[i]+" ");
        }

        System.out.println("\nAfter Reversing Array Elements :");
        for(int i=(n-1);i>=0;i--){
            System.out.print(num[i]+" ");
        }

    }
    
}