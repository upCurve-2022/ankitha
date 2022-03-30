// binary to decimal
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter  number:");
        int n=s.nextInt();

        int ans=0,p=0;

        while(n!=0)
        {
            ans+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }

        System.out.println(ans);
    }
}
