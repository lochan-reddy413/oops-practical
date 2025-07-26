package opps_practical;
import java.util.Scanner;
public class ao{

  public static void main(String args[]) {
    int a,b;
    Scanner S = new Scanner(System.in); 
    System.out.println("enter a number");

      a = S.nextInt();
      System.out.println("Enter another number");

      b = S.nextInt();
        
    System.out.println("a + b = " + (a + b));

     
      System.out.println("a - b = " + (a - b));

     
      System.out.println("a * b = " + (a * b));

     
      System.out.println("a / b = " + (a / b));

     
      System.out.println("a % b = " + (a % b));
    }
  }