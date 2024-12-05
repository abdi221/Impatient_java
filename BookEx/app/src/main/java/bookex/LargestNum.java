package bookex;

import java.util.Scanner;

public class LargestNum {
  Scanner scanner = new Scanner(System.in);

  public void largest() {
    int a, b, c;
    System.out.println("Enter three integers to see which is biggest:");
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();

    // if (a > b && a > c) {
    //   System.out.println(a + " seems to be bigger than " + b + " and " + c);
    // } else if (b > a && b > c) {
    //   System.out.println(b + " seems to be bigger than " + a + " and " + c);
    // } else {
    //   System.out.println(c + " seems to be bigger than " + a + " and " + b);

    // }

    // This is what you should do instead:
    // Comparing first if a is greater than b if true, compare if a greater than c, otherwise if b is greater than c 
    int largNum = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    System.out.println("Using the conditional operator: Largest number is " + largNum);

    int mathmax = (Math.max(a, Math.max(b, c)));
    System.out.println("\nUsing Math.max function: Largest number is " + mathmax);
  }


}
