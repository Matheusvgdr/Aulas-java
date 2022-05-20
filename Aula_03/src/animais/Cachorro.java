package animais;

public class Cachorro {
	
		private int tamanho;
		
		public int getTamanho(){
			
			return tamanho;
		
		}
		public void setTamanho(int s){
			
			tamanho = s;
		
		}
		
		void latir(){
			
			if (tamanho > 60){
				
			System.out.println("Woof! Woof!");
			
			} else if (tamanho > 14){
				
			System.out.println("Ruff! Ruff!");
			
			} else {
				
			System.out.println("Yip! Yip!");
			}
		
		}

	

}
