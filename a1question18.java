//factoraial
import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Enter value ");
	int n= sc.nextInt(); 
int i,fact=1;  
      
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
		
	}
}
