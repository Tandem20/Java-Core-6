package Tandem20A2;

public class MyCalculator implements Tandem20A .Numerable  {
double a;
double b;

public MyCalculator() {
	
}
public MyCalculator(double a, double b) {
	
	this.a = a;
	this.b = b;
}
@Override
public double plus() {
	return this.a + this.b;
}
@Override
public double minus() {
	
	return this.a - this.b;
}
@Override
public double multiply() {
	
	return this.a * this.b;
}
@Override
public double devide() {
	
	return this.a / this.b;
}
static void viewCalcResult(double result) {
	System.out.println("Vidpovid" + result);
}
}
