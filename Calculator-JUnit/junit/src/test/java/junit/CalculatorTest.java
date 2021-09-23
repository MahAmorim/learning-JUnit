package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  Calculator calc = new Calculator();

  @Test
  public void sumTest() {
    assertEquals(2, calc.sum(1, 1));
  }

  @Test
  public void subtractTest() {
    assertEquals(0, calc.subtract(1, 1));
  }

  @Test
  public void multipliesTest() {
    assertEquals(1, calc.multiplies(1, 1));
  }

  @Test
  public void divideTest() {
    assertEquals(1, calc.divide(2, 2));
  }

  @Test
  public void restOfEntireDivisionTest() {
    assertEquals(0, calc.restOfEntireDivision(2, 1));
  }
}
