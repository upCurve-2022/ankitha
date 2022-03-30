//reverse the num
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int a, b, c, largest, temp,seclar; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  number:");  
int n=sc.nextInt();
int reverse = 0;  
while(n != 0)   
{  
int remainder = n % 10;  
reverse = reverse * 10 + remainder;  
n = n/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
	}
}
