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
    assertEquals(8.6, calculator.calculate("3.6 + 5"), 0.0001);
  }

  @Test
  void testAdditionWithZero() {
    assertEquals(3.0, calculator.calculate("0 + 3"), 0.0001);
    assertEquals(2.0, calculator.calculate("2+0"), 0.0001);
  }

  @Test
  void testAdditionWithNegativeNumbers() {
    assertEquals(-1, calculator.calculate("-2+1"), 0.0001);
    assertEquals(-5, calculator.calculate("-2 +-3"), 0.0001);
  }

  @Test
  void testAdditionWithLargeNumbers() {
    assertEquals(2000000000, calculator.calculate("1000000000 + 1000000000"));
  }


  @Test
  void testSubtraction() {
    assertEquals(-2.3, calculator.calculate("3.4 - 5.7"), 0.0001);
  }

  @Test
  void testMultiplication() {
    assertEquals(15.0, calculator.calculate("5 * 3"), 0.0001);
  }

  @Test
  void testDivision() {
    assertEquals(2.0, calculator.calculate("6 / 3"), 0.0001);
  }
}
