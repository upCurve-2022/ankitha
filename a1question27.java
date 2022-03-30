//armstrong number
import java.util.*;
public class Armstrong{
public static void main(String args[]){
    int n,temp,r,res=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a number:");
    n=sc.nextInt();
    temp=n;
    while(n!=0){
       r=n%10;
       res=res+r*r*r;
        n=n/10;
    }
        if(res==temp)
         System.out.println("armstrong number");
         else
         System.out.println("not armstrong number");
   
}
}
