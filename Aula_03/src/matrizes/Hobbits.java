package matrizes;

public class Hobbits {

	String nome;

	public static void main(String[] args) {
		
/*o erro estava na posição do incremento, por estar em primeiro lugar a codição do 0 não é contabilizada,
 *  portanto se põe no final, e também como o array é de tamanho 3, deve-se diminuir o tamanho do parâmetro*/
		Hobbits[] h = new Hobbits[3];
		
		int z = 0;
		
		while (z < 3) {
			
			
			
			h[z] = new Hobbits();
			h[z].nome = "Bilbo";
			
			if (z == 1) {
				
				h[z].nome = "Frodo";
				
			}
			if (z == 2) {
				
				h[z].nome = "Sam";
				
			}
			
			System.out.print(h[z].nome + " é um ");
			System.out.println("bom nome para um Hobbit");
			
			z = z + 1;

		}
	}

}
