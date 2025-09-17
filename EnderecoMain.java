package Exercicios;

public class EnderecoMain {

	public static void main(String[] args) {
		
		Endereço EnderecoUm = new Endereço();
		
		EnderecoUm.setRua("Rua Ijeteson Roque Duarte");
		EnderecoUm.setNumero(04);
		EnderecoUm.setBairro("Vila Prado");
		EnderecoUm.setCep(18212490);
		EnderecoUm.setCidade("Itapetininga");
		
		System.out.println();
		
		System.out.println(EnderecoUm.getRua());
		System.out.println(EnderecoUm.getNumero());
		System.out.println(EnderecoUm.getBairro());
		System.out.println(EnderecoUm.getCep());
		System.out.println(EnderecoUm.getCidade());
		
	}

}
