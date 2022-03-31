import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);

   
    System.out.print("Enter number of elements: ");
    double size = scan.nextInt();
   int array[] = new int[size];
    
   double sum = 0.0;
    // declare average variable
    double avg = 0.0;

    // take numbers and store them to the array
    System.out.println("Enter array elements: ");
    for (int i=0; i<array.length; i++) {
      array[i] = scan.nextInt();
      // add numbers
      sum = sum + array[i];
    }

    // calculate the average value
    avg = sum/array.length;

    // display result
    System.out.println("Average: " + avg );
  }
}
