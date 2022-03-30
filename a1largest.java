//pgm to find largest and second largest of 3 nums
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int a, b, c, largest, temp,seclar; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
temp=a>b?a:b;  
largest=c>temp?c:temp; 
if(a>b&&a<c)
seclar=a;
else if(b>a&&b<c)
seclar=b;
else seclar=c;
System.out.println("The largest number is: "+largest+" second larest: "+seclar);  
	}
}
