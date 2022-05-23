package calculadora;

public class Conta {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
	
			/*cal.setValor1(12);
			cal.setValor2(6);
			
			System.out.println(cal.somar(4,5));
			System.out.println(cal.subtrair());
			System.out.println(cal.multiplicar());
			System.out.println(cal.dividir());*/
		
		System.out.println(cal.somar(5, 10));
		System.out.println(cal.subtrair(4, 8));
		System.out.println(cal.dividir(0, 5));
		
			
		}
		
	}

