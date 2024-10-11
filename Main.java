import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // problem 1
    // System.out.println("Enter a postivie integer: ");
    // int n = sc.nextInt();
    // printRandom3(n);

    // problem 2
    // System.out.println("Enter the first x-corrdinate: ");
    // double x1 = sc.nextDouble();

    // System.out.println("Enter the second x-coordinate: ");
    // double x2 = sc.nextDouble();

    // System.out.println("Enter the first y-corrdinate: ");
    // double y1 = sc.nextDouble();

    // System.out.println("Enter the second y-coordinate: ");
    // double y2 = sc.nextDouble();

    // System.out.println("Slope: " + calcSlope(x1,x2,y1,y2));


    System.out.println("Enter two doubles: ");
    double doub1 = sc.nextDouble();
    double doub2 = sc.nextDouble();

    System.out.println("Distance: " + roundedDist(doub1,doub2));

  }

  public static int printRandom3(int n)
  {
    int num = n+1; 
    System.out.println("Random numbers: ");
    System.out.println((int) ((Math.random() * num) + 2));
    System.out.println((int) ((Math.random() * num) + 2));
    System.out.println((int) ((Math.random() * num) + 2));
    return num;
  }
  public static double calcSlope(double x1, double y1, double x2, double y2)
  {
    return (y2-y1)/(x2-x1);
    
  }
  public static int roundedDist(double num1, double num2); 
  {
    double dist = Math.abs(num2 - num1);
    int rounded_num = (int) (dist + 0.5);
  }
}
