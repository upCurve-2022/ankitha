//display numbers in words
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int a, b, c, largest, temp,seclar; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the  number:");  
int n=sc.nextInt();
String s="";
while(n>0){
    int t=n%10;
    if(t==1)
    s="one "+s;
    else if(t==2)
    s="two "+s;
    else if(t==3)
    s="three "+s;
    else if(t==4)
    s="four "+s;
    else if(t==5)
    s="five "+s;
    else if(t==6)
    s="six "+s;
    else if(t==7)
    s="seven "+s;
    else if(t==8)
    s="eight "+s;
    else if(t==9)
    s="nine "+s;
    else 
    s="ten "+s;
    n=n/10;
}
System.out.println(s);
	}
}
