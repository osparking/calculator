package calculator.test;

import calculator.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 20);
		if (result != 30) {
			System.out.println("덧셈연산 오류: " + result);
		}
	}
}
