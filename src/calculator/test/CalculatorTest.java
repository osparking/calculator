package calculator.test;

import java.io.PrintStream;

import calculator.Calculator;
import space.jbpark.utility.MyUtil;

public class CalculatorTest {

	private int errorCount = 0;
	private final PrintStream ps = MyUtil.getPrintStream();

	private void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 20);
		if (result != 40) {
			throw new IllegalStateException("덧셈연산 오류: " + result);
		}
	}

	public static void main(String[] args) {
		var tester = new CalculatorTest();
		try {
			tester.testAdd();
		}catch (IllegalStateException e) {
			++tester.errorCount;
			e.printStackTrace(tester.ps);
		}
		if (tester.errorCount > 0) {
			throw new IllegalStateException("오류 갯수: " + tester.errorCount);
		}
	}
}
