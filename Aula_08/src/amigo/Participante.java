package amigo;

import java.util.Date;

public class Participante {

		private String nome;
		private String presente;
		private Date aniversario;
		
		
		
		public Date getAniversario() {
			return aniversario;
		}
		public void setAniversario(Date aniversario) {
			this.aniversario = aniversario;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getPresente() {
			return presente;
		}
		public void setPresente(String presente) {
			this.presente = presente;
		}
		@Override
		//Toda vez que é utilizado um print, é executado um toString();
		public String toString() {
			return "O sorteado foi " + nome + " o presente é " + presente + " e seu aniversário é " + aniversario;
		}
		

	}

