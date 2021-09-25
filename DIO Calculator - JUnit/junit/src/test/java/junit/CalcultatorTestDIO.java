package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcultatorTestDIO {
  static Calculator calc;

  @BeforeAll
  public static void setup() {
    calc = new Calculator();

  }

  @Test
  public void CalculatorTestSum() {
    // Calculator calc = new Calculator();

    boolean temErro = false;
    if (calc.sum(2, 2) != 4) {
      temErro = true;
    }
    if (calc.sum(2, -2) != 0) {
      temErro = true;
    }
    if (calc.sum(-2, 2) != 0) {
      temErro = true;
    }
    if (calc.sum(-2, -2) != -4) {
      temErro = true;
    }
    if (calc.sum(0, 0) != 0) {
      temErro = true;
    }
    if (temErro) {
      fail("Houve um erro na validação da soma.");
    }
  }

  @Test
  @Disabled
  public void CalculatorTestSub() {
    // Calculator calc = new Calculator();

    boolean temErro = false;
    if (calc.subtract(2, 2) != 0) {
      temErro = true;
    }
    if (calc.subtract(2, -2) != 4) {
      temErro = true;
    }
    if (calc.subtract(-2, 2) != -4) {
      temErro = true;
    }
    if (calc.subtract(-2, -2) != 0) {
      temErro = true;
    }
    if (calc.subtract(0, 0) != 0) {
      temErro = true;
    }
    if (temErro) {
      fail("Houve um erro na validação da subtração.");
    }
  }

  // Realização de teste mais específico
  @Test
  public void CalculatorTestMultEquals4() {
    assertEquals(4, calc.multiplies(2, 2));
    assertEquals(4, calc.multiplies(-2, -2));
    assertEquals(-4, calc.multiplies(2, -2));
    assertEquals(-4, calc.multiplies(-2, 2));
  }

  @Test
  public void CalculatorTestException() {
    // Calculator calc = new Calculator();

    boolean temErro = false;
    if (calc.sum(2, 2) != 4) {
      temErro = true;
    }
    if (calc.sum(2, -2) != 0) {
      temErro = true;
    }
    if (calc.sum(-2, 2) != 0) {
      temErro = true;
    }
    if (calc.sum(-2, -2) != -4) {
      temErro = true;
    }
    if (calc.sum(0, 0) != 0) {
      temErro = true;
    }
    if (temErro) {
      fail("Houve um erro na validação da soma.");
    }
  }

  @DisplayName("Multiplies CSV")
  @ParameterizedTest
  @CsvSource({ "1, 1, 1", "2, 3, 6" })

  void CalculatorTestMultCSV(int parcela1, int parcela2, double result) {
    assertEquals(result, calc.multiplies(parcela1, parcela2));
  }

  @DisplayName("Multiplies CSV with File")
  @ParameterizedTest
  @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
  void validaMultiplasSomasArqCSV(double parcela1, double parcela2, double result) {
    assertEquals(result, calc.sum(parcela1, parcela2));
  }

  @Test
  public void DivideByZeroException() {
    assertThrows(ArithmeticException.class, () -> {
      int result = calc.restOfEntireDivision(4, 0);
      System.out.println(result);
    });
  }
}