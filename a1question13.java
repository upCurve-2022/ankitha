//sequence 1,4,27,256,3125.......N
import java.util.*;
import java.lang.Math;


public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n=sc.nextInt();
         for(int i=1;i<=n;i++)
        {
                System.out.print((int)Math.pow(i,i)+" ");

        }
    }
}
