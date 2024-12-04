package bookex;

import java.util.Scanner;

public class ReadingAngle {
  Scanner scanner = new Scanner(System.in);

  public void Angle() {
    System.out.println("Give me an angle to normalize:");
    double angle = scanner.nextDouble();

    // if (angle < 0 && angle > -360) {
    //   angle += 360.0;
    //   System.out.print("Normalized negative angle:  " + angle);

    // } else if (angle > 0 && angle < 360) {
    //   angle -= 360.0;
    //   System.out.println("Normalized positive angle:" + angle);
    // } else {

    //   System.out.println("Either you gave me its bigger than 360 or less than -360 " + angle);
    // }

    // Better approach:

    double normalizeAngle = (angle % 360 + 360) % 360;
    System.out.println("The normalized angle is " + normalizeAngle);

  }
}
