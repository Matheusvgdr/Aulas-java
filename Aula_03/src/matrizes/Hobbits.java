package matrizes;

public class Hobbits {

	String nome;

	public static void main(String[] args) {
		
/*o erro estava na posi��o do incremento, por estar em primeiro lugar a codi��o do 0 n�o � contabilizada,
 *  portanto se p�e no final, e tamb�m como o array � de tamanho 3, deve-se diminuir o tamanho do par�metro*/
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
			
			System.out.print(h[z].nome + " � um ");
			System.out.println("bom nome para um Hobbit");
			
			z = z + 1;

		}
	}

}
