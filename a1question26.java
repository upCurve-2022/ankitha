//palindrome
import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Enter value ");
	    String n= sc.nextLine();     boolean flag = true;  
            
        n = n.toLowerCase();  
        for(int i = 0; i < n.length()/2; i++){  
            if(n.charAt(i) != n.charAt(n.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }  
        if(flag)  
            System.out.println("Given string is palindrome");  
        else  
            System.out.println("Given string is not a palindrome");  
	}
}
