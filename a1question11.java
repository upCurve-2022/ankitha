//sequence 4,16,36,64.....N
import java.util.*;
import java.io.*;
class Main{  
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
	   System.out.printf("Enter number");
	    n=sc.nextInt();
	    int i=2;
	    while(n>0){
            System.out.print((i * i) + " ");
            n--;
            i=i+2;
        }

    
	}
}
