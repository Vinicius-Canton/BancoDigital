package banco;

public class Cliente {
	private String nome;
	private int idade;
	
	public Cliente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade >= 18 && idade < 120) {
			this.idade = idade;		
			System.out.println(idade);
		}
		else {
			System.out.println("Não é possível cadastrar com essa idade");
		}
	}
	
	
	
}
