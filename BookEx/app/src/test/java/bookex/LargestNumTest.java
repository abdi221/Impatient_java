package bookex;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LargestNumTest {
  @Test void classChecksLargestNum() {
    LargestNum checkLogic = new LargestNum();
    
    
    // Mock user input
    String userInput = "12\n23\n10\n";
    // Using System.setIn() for reading s.c user input
    System.setIn(new ByteArrayInputStream(userInput.getBytes()));  // This makes the program behave as it would have done if a human was interacting with it
    
    // This mocks the console output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    
    // Run the method
    checkLogic.largest();

    // Assert that the correct largest number is displayed using conditional operator
    String output = outputStream.toString();
    Assertions.assertTrue(output.contains("12 seeems to be bigger"),"The logic should correctly identify the largest number");
  }
  
}
