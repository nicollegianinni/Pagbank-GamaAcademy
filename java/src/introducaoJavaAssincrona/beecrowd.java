package introducaoJavaAssincrona;

import java.util.Scanner;

/*
Exercicio proposto pelo professor Isidro masseto do beecrowd:
Joao quer calcular e mostrar a quantidade de litros de combustivel gastos em uma viagem.
Ele usou automovel que gasta 12 kw/L. Para isso, ele gostaria que você o auxiliasse atraves de 
um simples programa. Para efetuar o calculo, deve-se fornecer o tempo gasto na viagem (em horas),
a velocidade media durante (em km/h). Assim, pode-se obter a distancia percorrida, e calcular quantos litros
necessarios. (obs.: mostre o valor em 3 casas decimais)
 
 
 
 Resolução:
 
 dados
 carro faz 12 km/L
 distancia
 velocidadeMedia
 
 
 quantidade de combustivel = distancia * velocidadeMedia 
 
 */

public class beecrowd {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	//entrada
	double distancia,litros, tempoH ;
	int velocidadeMedia;
	int consumo = 12;

	System.out.println("qual a velocidade media:");
	velocidadeMedia = entrada.nextInt();
	System.out.println("qual o tempo em horas:");
	tempoH = entrada.nextDouble();
		
	
	//processamento
	
	distancia = tempoH * velocidadeMedia;
	litros = distancia  / consumo ;
	
	//saida
	
	System.out.printf("você usará %.3f", + litros  ," litros de gasolina para a distancia de ", + distancia);
	
	entrada.close();
	
	
	}

}
