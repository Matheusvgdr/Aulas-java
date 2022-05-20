package calculadora;

public class Conta {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
		
		cal.setValor1(12);
		cal.setValor2(6);
		
		System.out.println(cal.somar());
		System.out.println(cal.subtrair());
		System.out.println(cal.multiplicar());
		System.out.println(cal.dividir());

	}

}
