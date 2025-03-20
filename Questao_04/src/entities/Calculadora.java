package entities;

public class Calculadora {

	public static double calculoJuros(double a, int b, double c) {
		return a * (Math.pow((1 + c), b));
	}
}
