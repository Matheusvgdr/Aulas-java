package calculadora;

public class Conta {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
		
		System.out.println("Digite o primeiro valor");
		cal.setValor1();
		
		System.out.println("Digite a operação: 1 = + | 2 = - | 3 = * | 4 = /");
		cal.setOp();
		
		System.out.println("Digite o segundo valor");
		cal.setValor2();
		
		if(cal.getOp() == 1) {
			
			System.out.println("O resultado da soma é: " + cal.somar());
			
		}if (cal.getOp() == 2) {
			
			System.out.println("O resultado da subtração é: " + cal.subtrair());
			
		} if (cal.getOp() == 3) {
			
			System.out.println("O resultado da multiplicação é: " + cal.multiplicar());
			
		}if (cal.getOp() == 4) {
			
			if(cal.getValor1() == 0) {
				
				System.out.println("Não é possivel fazer essa conta");
				
			} else {
				
			System.out.println("O resultado da divisão é: " + cal.dividir());
			
			}
		}
	
			
	
			
			
	
		
		
		
		
		

		
		
//		// Constructor com parametro = Calculadora cal = new Calculadora(1,2);
//		double calculo = 0;
//		
//		//metodo com os parametros já passados pelo constructor;
//		cal.somar();
//
//		/*
//		 * cal.setValor1(12); cal.setValor2(6);
//		 * 
//		 * System.out.println(cal.somar(4,5)); System.out.println(cal.subtrair());
//		 * System.out.println(cal.multiplicar()); System.out.println(cal.dividir());
//		 */
//
//		System.out.println(cal.somar(5, 10));
//		System.out.println(cal.subtrair(4, 8));
//		
//		
//		calculo = cal.dividir(6, 0);
//		
//		if (calculo == 0) {
//
//			System.out.println("Não é permitido usar 0 na divisão");
//
//		} else {
//
//			System.out.println(cal.dividir(6, 0));
//
//		}
	}

}
