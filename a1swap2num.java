import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        
       int p, q, t;   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of p and q");  
       p = sc.nextInt();  
       q = sc.nextInt();  
       System.out.println("before swapping numbers: "+p +"   "+q);  
       t = p;  
       p = q;  
       q = t;  
       System.out.println("After swapping: "+p +"   "+q );  
       System.out.println( );  
    }    
}
