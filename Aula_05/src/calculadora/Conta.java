package calculadora;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {

		double primeiroNumero, segundoNumero;
		String operacao, resposta;

		Conta calculo = new Conta();
		Scanner teclado = new Scanner(System.in);
		
		

		System.out.println("Digite o primeiro n�mero: ");
		primeiroNumero = teclado.nextDouble();

		System.out.println("Digite o segundo valor:");
		segundoNumero = teclado.nextDouble();

		resposta = "sim";

		while (resposta.equals("sim")) {

			System.out.println("Escolha uma das opera��es (+, -, *, /)");
			operacao = teclado.next();

				System.out.println("O resultado �: " + calculo.calcular(primeiroNumero, segundoNumero, operacao));
			
			System.out.println("Gostaria de fazer outra opera��o? Digite sim ou n�o");
			resposta = teclado.next();

		}

	}
	
	public double calcular(double primeiroNumero, double segundoNumero, String operacao) {

		Calculadora calculadora = new Calculadora();
		double resultado = 0;
		
		if (operacao.equals("+")) {

			resultado = calculadora.somar(primeiroNumero, segundoNumero);

		} else if (operacao.equals("-")) {

			resultado = calculadora.subtrair(primeiroNumero, segundoNumero);

		} else if (operacao.equals("*")) {

			resultado = calculadora.multiplicar(primeiroNumero, segundoNumero);

		} else if (operacao.equals("/")) {

			resultado = calculadora.dividir(primeiroNumero, segundoNumero);

		} else {

			System.out.println("N�o � poss�vel fazer essa opera��o");
		}
		
		return resultado;

	}
}

//Calculadora cal = new Calculadora();
//
//System.out.println("Digite o primeiro valor");
//cal.setValor1();
//
//System.out.println("Digite a opera��o: (+, -, *, /)");
//cal.setOp();
//
//System.out.println("Digite o segundo valor");
//cal.setValor2();
//
//if(cal.getOp() == 1) {
//	
//	System.out.println("O resultado da soma �: " + cal.somar());
//	
//}if (cal.getOp() == 2) {
//	
//	System.out.println("O resultado da subtra��o �: " + cal.subtrair());
//	
//} if (cal.getOp() == 3) {
//	
//	System.out.println("O resultado da multiplica��o �: " + cal.multiplicar());
//	
//}if (cal.getOp() == 4) {
//	
//	if(cal.getValor1() == 0) {
//		
//		System.out.println("N�o � possivel fazer essa conta");
//		
//	} else {
//		
//	System.out.println("O resultado da divis�o �: " + cal.dividir());
//	
//	}
//}
