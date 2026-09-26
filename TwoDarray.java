import java.util.Scanner;
public class TwoDarray {

    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of  2D array  1:");
        
        int  n=sc.nextInt();
        int m=sc.nextInt();

        int[][]  arr1 =new int[n][m];
        System.out.println("Enter the elements of 2D array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

      
        System.out.println("Enter the size of  2D array  2:");
        
        int  a=sc.nextInt();
        int b=sc.nextInt();

        int [][] arr2=new int[a][b];


        System.out.println("Enter the elements of 2D array:");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array 1 Elements :");
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
        }
        System.out.println("\nArray 2 Elements :");

        for(int i=0;i<a;i++){
            System.out.println();
            for(int j=0;j<b;j++){
                System.out.print(arr2[i][j]+" ");
            }
        }

        System.out.println("\nEnter the Choice of operation (\"+\" ,\"-\" ,\"/\",\"*\"):");
        String choice =sc.next();
        switch(choice){
            case "+":
                if(n==a && b==m){
                    int [][] sum=new int[n][m];
                    for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                            sum[i][j]=arr1[i][j]+arr2[i][j];
                        }
                    }

                for(int i=0;i<a;i++){
                    System.out.println();
                    for(int j=0;j<b;j++){
                        System.out.print(sum[i][j]+" ");
                    }
                }
                }

                break;

            case"-":
                    if(n==a && b==m){
                        int [][] sub=new int[n][m];
                        for(int i=0;i<n;i++){
                            for(int j=0;j<m;j++){
                                sub[i][j]=arr1[i][j]-arr2[i][j];
                            }
                        }
                    

                        for(int i=0;i<a;i++){
                            System.out.println();
                            for(int j=0;j<b;j++){
                                System.out.print(sub[i][j]+" ");
                            }
                        }
                    }

                break;

            case "*":
                    if(n==a && b==m){
                        int [][] multi=new int[n][m];
                        for(int i=0;i<n;i++){
                            for(int j=0;j<m;j++){
                                multi[i][j]=arr1[i][j]*arr2[i][j];
                            }
                        }
                    

                        for(int i=0;i<a;i++){
                            System.out.println();
                            for(int j=0;j<b;j++){
                                System.out.print(multi[i][j]+" ");
                            }
                        }
                    }
                        
                          

                
                break;

            case "/":
                if(n==a && b==m){
                    int [][] div=new int[n][m];
                    for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                            div[i][j]=arr1[i][j]/arr2[i][j];
                        }
                    }
                

                    for(int i=0;i<a;i++){
                        System.out.println();
                        for(int j=0;j<b;j++){
                            System.out.print(div[i][j]+" ");
                        }
                    }
                }

                break;
            default:
                System.out.println("Invalid Choice");
                break;
            

        }
        sc.close();

    }
    
}
