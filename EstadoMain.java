package Exercicios;

public class EstadoMain {

	public static void main(String[] args) {
		
		Estado EstadoUm = new Estado();
		
		EstadoUm.setNome("Aurora");
		EstadoUm.setSigla("MT");
		
		System.out.println("");
		
		System.out.println(EstadoUm.getNome());
		System.out.println(EstadoUm.getSigla());
	}

}
