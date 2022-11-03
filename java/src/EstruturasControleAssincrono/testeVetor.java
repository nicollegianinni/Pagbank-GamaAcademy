package EstruturasControleAssincrono;

import java.util.Scanner;

public class testeVetor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ENTRADA
        double valores[];

        valores = new double[5];

        System.out.println("Digite os valores: ");
		
		/* invez disso usa o FOR
		valores[0] = entrada.nextDouble();
		valores[1] = entrada.nextDouble();
		valores[2] = entrada.nextDouble();
		valores[3] = entrada.nextDouble();
		valores[4] = entrada.nextDouble();*/

        for (int posi = 0; posi < 5; posi++) {
            valores[posi] = entrada.nextDouble();
        }
        // PROCESSSAMENTO

        System.out.println("os numeros em sequencia :");
        for (int posi = 0; posi < valores.length; posi++) {
            // SAIDA
            System.out.printf("%.1f ", valores[posi]); // porcentagem.1f = formato 1 casa decimal depois da virgula, do tipo f: float ou double.
        }

        entrada.close();

    }
}
