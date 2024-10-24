/*Conversão de Temperatura: Peça ao usuário uma temperatura em Celsius e 
 * converta para Fahrenheit, informando se a temperatura é quente (Fahrenheit > 80) ou fria.
 */
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em celsius: ");
		double celsius = sc.nextDouble();

		double Fahrenheit = celsius * 1.8 + 32;
		System.out.printf("A temperatura em Fahrenheit: %.2f °F %n", Fahrenheit);

		if (Fahrenheit > 80) {
			System.out.println("A temperatura está quente");
		} else {
			System.out.println("A temperatura está fria");
		}
		sc.close();
	}

}
