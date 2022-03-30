// vol of cylinder
import java.util.*;
class Main {
    public static void main(String[] args) {
        int radius,height;
        double volume;
        Scanner sc=new Scanner(System.in);
        radius=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        height=sc1.nextInt();
        volume = 3.14 * radius * radius * height;
        System.out.println("volume of cylinder is:" +volume); 
    }
}
