package junit;

public class Calculator {
  public double sum(double portion1, double portion2) {
    return portion1 + portion2;
  }

  public double subtract(double minuend, double subtrahend) {
    return minuend - subtrahend;
  }

  public double multiplies(double factor1, double factor2) {
    return factor1 * factor2;
  }

  public double divide(double dividend, double divisor) {
    return dividend / divisor;
  }

  public int restOfEntireDivision(int dividend, int divisor) {
    return dividend % divisor;
  }

}
