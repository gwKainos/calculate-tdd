package kr.kainos.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void testAddition() {
    int result = calculator.addition(2, 3);

    assertEquals(5, result);
  }

  @Test
  void testAdditionWithZero() {
    assertEquals(3, calculator.addition(0, 3));
    assertEquals(2, calculator.addition(2, 0));
  }

  @Test
  void testAdditionWithNegativeNumbers() {
    assertEquals(-1, calculator.addition(-2, 1));
    assertEquals(-5, calculator.addition(-2, -3));
  }

  @Test
  void testAdditionWithLargeNumbers() {
    assertEquals(2000000000, calculator.addition(1000000000, 1000000000));
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
