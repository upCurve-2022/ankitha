//printing N terms of the sequence 1 4 27 256 3125....
import java.util.Scanner;
public class Sequence3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            int num= (int) Math.pow(i,i);
            System.out.print(num+" ");
        }
    }
}
© 2022 GitHub, In
