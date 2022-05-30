package megasena;

import java.util.Random;

public class Megasena {

	public static void main(String[] args) {

		int num, num1, num2, num3, num4, num5;

		Random mega = new Random();

		System.out.println("Os números da megasena são: ");

		for (int i = 0; i < 1; i++) {

		}

		num = mega.nextInt(60) + 1;
		num1 = mega.nextInt(60) + 1;
		num2 = mega.nextInt(60) + 1;
		num3 = mega.nextInt(60) + 1;
		num4 = mega.nextInt(60) + 1;
		num5 = mega.nextInt(60) + 1;


		if (num == num1 || num == num2 || num == num3 || num == num4 || num == num5) {
			
			
			num = mega.nextInt(60) + 1;
			num1 = mega.nextInt(60) + 1;
			num2 = mega.nextInt(60) + 1;
			num3 = mega.nextInt(60) + 1;
			num4 = mega.nextInt(60) + 1;
			num5 = mega.nextInt(60) + 1;
			
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			
		}
		else if (num1 == num || num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5) {
			
			num = mega.nextInt(60) + 1;
			num1 = mega.nextInt(60) + 1;
			num2 = mega.nextInt(60) + 1;
			num3 = mega.nextInt(60) + 1;
			num4 = mega.nextInt(60) + 1;
			num5 = mega.nextInt(60) + 1;
			
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
		}
		else if (num2 == num || num2 == num1 || num1 == num3 || num1 == num4 || num1 == num5) {

			num = mega.nextInt(60) + 1;
			num1 = mega.nextInt(60) + 1;
			num2 = mega.nextInt(60) + 1;
			num3 = mega.nextInt(60) + 1;
			num4 = mega.nextInt(60) + 1;
			num5 = mega.nextInt(60) + 1;
			
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
		}
		
		else if (num3 == num || num3 == num1 || num3 == num2 || num3 == num4 || num3 == num5) {

			num = mega.nextInt(60) + 1;
			num1 = mega.nextInt(60) + 1;
			num2 = mega.nextInt(60) + 1;
			num3 = mega.nextInt(60) + 1;
			num4 = mega.nextInt(60) + 1;
			num5 = mega.nextInt(60) + 1;
			
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
		}
		
		else if (num4 == num || num4 == num1 || num4 == num2 || num4 == num3 || num3 == num5) {

			num = mega.nextInt(60) + 1;
			num1 = mega.nextInt(60) + 1;
			num2 = mega.nextInt(60) + 1;
			num3 = mega.nextInt(60) + 1;
			num4 = mega.nextInt(60) + 1;
			num5 = mega.nextInt(60) + 1;
			
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
		}
		else if (num5 == num || num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4) {

			num = mega.nextInt(60) + 1;
			num1 = mega.nextInt(60) + 1;
			num2 = mega.nextInt(60) + 1;
			num3 = mega.nextInt(60) + 1;
			num4 = mega.nextInt(60) + 1;
			num5 = mega.nextInt(60) + 1;
			
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
			
		} else {
			
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num5);
		}
	}

}
