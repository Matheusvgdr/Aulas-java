
public class Challenge {

	public static void main(String[] args) {

		int number = 0;
		String virg = ",";

		while (number <= 10) {

			System.out.print(number + virg);
			number++;

			if (number == 10) {
				virg = ".";
			}
		}

	}

}
