package kr.kainos.tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: java Calculator \"<expression>\"");
      return;
    }

    String expression = String.join(" ", args);
    Calculator calculator = new Calculator();
    try {
      double result = calculator.calculate(expression);
      System.out.println("Result: " + result);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public double calculate(String expression) {
    Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)\\s*([+\\-*/])\\s*(-?\\d+(\\.\\d+)?)");
    Matcher matcher = pattern.matcher(expression);

    if (!matcher.matches()) {
      throw new IllegalArgumentException("Invalid input format");
    }

    double operand1 = Double.parseDouble(matcher.group(1));
    String operator = matcher.group(3);
    double operand2 = Double.parseDouble(matcher.group(4));

    return switch (operator) {
      case "+" -> operand1 + operand2;
      case "-" -> operand1 - operand2;
      case "*" -> operand1 * operand2;
      case "/" -> {
        if (operand2 == 0) {
          throw new ArithmeticException("Cannot divide by zero");
        }
        yield operand1 / operand2;
      }
      default -> throw new IllegalArgumentException("Invalid operator: " + operator);
    };
  }
}
