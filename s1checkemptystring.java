//check if string is empty
import java.util.*;
class Main{
    public static void main(String[] args) {
       
       
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
         String  str=sc.nextLine();
        if(str.isEmpty()){
            System.out.println("string is empty");
            
        }
        else{
            System.out.println("string is not empty");
        }
    }
