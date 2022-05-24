package calculadora;

import java.util.Scanner;

public class Calculadora {

	private double valor1;
	private double valor2;
	private int op;

	Scanner conta = new Scanner(System.in);

	public double getValor1() {
		return valor1;
	}

	public void setValor1() {

		this.valor1 = conta.nextInt();

	}

	public int getOp() {

		return op;
	}

	public void setOp() {

		this.op = conta.nextInt();

	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2() {

		this.valor2 = conta.nextInt();
	}

	public double somar() {

		return valor1 + valor2;

	}

	public double subtrair() {

		return valor1 - valor2;
	}
	public double multiplicar() {

	
	return valor1 * valor2;
	}

	public double dividir() {

		double retorno;

		if (valor2 == 0) {

			retorno = valor2;

		} else {

			retorno = valor1 / valor2;

		}

		return retorno;

	}
}
