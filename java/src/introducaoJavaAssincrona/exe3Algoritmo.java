package introducaoJavaAssincrona;

import java.util.Scanner;

/* 
 exercicio 3 : sabemos que o valor de 100 kw corresponde a 1/7 do valor do salario minimo,
  paga um algoritmo que receba o valor do salario minimo e a quantidade de kw gasta por residencia e calcule:
  a - o valor em reais de cada kw.
  b - o valor em reais a ser pago
  c - o novo valor do kw pago por residencia com desconto de 10%.
   
   Calculo: 
    
   		100 kw = 1/7 salario minimo
   		1 kw = x
   		
   		x * 100 = salarioMinimo / 7 ==> salarioMinimo / 7 / 100
   
   */

public class exe3Algoritmo {

	public static void main(String[] args) {

		// entrada
		Scanner entrada = new Scanner(System.in);

		double salarioMinimo, valorKw, qtdKw, valorTotal, valorDesconto;

		System.out.println("\n qual valor do salario mínimo ?");
		salarioMinimo = entrada.nextDouble();

		System.out.println("\n quantidade de kw gastos ?");
		qtdKw = entrada.nextDouble();

		
		// processamento
		// parte 1 - saber quanto custa 1 kw
		valorKw = salarioMinimo / 7 / 100;

		// parte 2 - valor da conta total
		valorTotal = valorKw * qtdKw;
		
		//parte 3 - valor com desconto 
		valorDesconto = (valorTotal * 0.9) ;
		
		
		// saida
		System.out.printf("\n  Valor        de      1 kw        é R$ %10.2f : " ,+ valorKw);
		System.out.printf("\n  Valor total da  conta SEM desconto R$ %10.2f : ", + valorTotal);
		System.out.printf("\n  Valor da conta COM 10 porcento DE DESCONTO R$ %10.2f : " ,+ valorDesconto);

	}

}
