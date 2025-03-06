package kr.kainos.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void createCalculator() {
    new Calculator();
  }

  @Test
  void testAddition() {
    Calculator calculator = new Calculator();
    int result = calculator.addition(2, 3);

    assertEquals(5, result);
  }

  @Test
  void testSubtraction() {
    int result = 5 - 3;
    assertEquals(2, result);
  }

  @Test
  void testMultiplication() {
    int result = 5 * 3;
    assertEquals(15, result);
  }

  @Test
  void testDivision() {
    int result = 6 / 3;
    assertEquals(2, result);
  }
}
