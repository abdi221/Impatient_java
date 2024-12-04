package bookex;

import java.util.Scanner;

public class NumSysCon {
  Scanner scanner = new Scanner(System.in);
  public void converter() {
    System.out.print("Give me a number to convert: ");
    int number = scanner.nextInt();

    System.out.println(number + " to binary is " + Integer.toBinaryString(number));
    System.out.println(number + " to hexadecimal is " + Integer.toHexString(number));
    System.out.println(number + " to octal is " + Integer.toOctalString(number));


    if (number != 0) {
      double reci = 1.0 / number;
      System.out.print("The reciprocal of the number is: \n" + reci);
    } else {
      System.out.println("You gave me a zzzerooo error cannot devide with zero");
    }
  }
   

  
    
}
