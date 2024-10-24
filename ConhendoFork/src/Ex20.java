/*Verificação de Par ou Ímpar: Peça um número ao usuário e informe se ele é par, 
 * ímpar ou neutro.
 */
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("O número é neutro.");
            } else if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else if (numero % 2 != 0){
                System.out.println("O número é ímpar.");
            }else {
            	System.out.println("Valor incorreto ou decimal");
            }
        sc.close();
    }
}