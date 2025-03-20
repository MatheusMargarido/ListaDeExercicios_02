package entities;

public class Calculadora {

	public static double mediaAritmetica(double a, double b, double c) {
		return (a + b + c) / 3;
	}

	public static double mediaGeometrica(double a, double b, double c) {
		return Math.cbrt(a * b * c);
	}

	public static double mediaHarmonica(double a, double b, double c) {
		return  3 / ((1 / a) + (1 / b) + (1 / c));
	}
}
