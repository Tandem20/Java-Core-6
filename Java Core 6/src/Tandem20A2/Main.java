package Tandem20A2;

public class Main {
public static void main(String[] args) {
	MyCalculator calc = new MyCalculator();
	calc.a = 5;
	calc.b = 2;
	MyCalculator.viewCalcResult(calc.plus());
	MyCalculator.viewCalcResult(calc.minus());
	MyCalculator.viewCalcResult(calc.multiply());
	MyCalculator.viewCalcResult(calc.devide());
	System.out.println();
	
}
}
