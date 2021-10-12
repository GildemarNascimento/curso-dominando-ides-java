package application;

import br.com.dio.Gate;

public class Program {

	public static void main(String[] args) {
		Gate gato = new Gate();
		
		gato.setNome("Bilu");
		gato.setCor("Preto");
		gato.setIdade(2);
		
		System.out.println(gato);
		
	}

}
