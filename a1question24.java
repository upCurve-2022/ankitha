//without inbuilt func
import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Enter value ");
	    int n= sc.nextInt(); 
        System.out.println("power");
        int p=sc.nextInt();
    int d=1;
        for(int i=0;i<p;i++){
            d=d*n;
        }
        System.out.println(d);
	}
}
