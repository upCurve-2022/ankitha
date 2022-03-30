//compare two strings
import java.util.*;
 class Main {
    public static void main(String args[]){
       String a,b;
        System.out.println("Enter string1");
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        System.out.println("Enter string2");
        Scanner s=new Scanner(System.in);
        b=s.nextLine();
        // a=a.toLowerCase();
        // b=b.toLowerCase();
        if(a.equals(b)){
            System.out.println("strings are equal.");
        } else {
            System.out.println(" not equal.");
        }

            }
}
