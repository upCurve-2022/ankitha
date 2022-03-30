//sequence -1,-2.-3,4,-5.......N
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
             System.out.print(" -"+i+" ");
            else
            System.out.print(i+" ");
        }
    }
}
