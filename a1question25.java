//reverse the string

import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.printf("Enter value ");
	    String n= sc.nextLine();  String  nstr="";
        char ch;
        for (int i=0; i<n.length(); i++)
      {
        ch= n.charAt(i);
        nstr= ch+nstr; 
      }
      System.out.println("Reverse: "+ nstr);
        System.out.println(nstr);
	}
}
