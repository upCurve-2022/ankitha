import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter number n1");
    double n1=sc.nextDouble();
    String s = String.valueOf(n1);
int i = s.indexOf(".");
System.out.println("Before Decimal: " + s.substring(0, i));
System.out.println("After Decimal Part: " + s.substring(i+1));
    
	}
}
