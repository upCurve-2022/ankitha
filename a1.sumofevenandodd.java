//pgm to calculate the sum of odd and even nums
import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter number n1");
    int n1=sc.nextInt();
    int odd=0;int even=0;
    for(int i=0;i<=n1;i++){
        if(i%2==0)
        even=even+i;
        else
        odd=odd+i;
    }
    System.out.println("odd "+odd+" even "+even);
    
	}
}
