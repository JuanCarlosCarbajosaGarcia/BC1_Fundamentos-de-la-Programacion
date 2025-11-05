package VSC;//cambio de temperatura de ºC a ºF

import java.util.Scanner;

public class CelsiusAFahrenheit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce temperatura a convertir ºC: ");
		double tempC = scanner.nextDouble();

		double tempF = (tempC * 9/5 ) + 32;
		System.out.println("la temperaturaen ºF es: " + tempF);
		scanner.close();
	}
}