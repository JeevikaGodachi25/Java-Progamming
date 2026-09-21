import java.util.Random;
public class RandomNumber {
    public static void main(String[] args){
        Random rn=new Random();
        int x=rn.nextInt(5)+1;
        Double  y= rn.nextDouble();
        boolean z=rn.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
