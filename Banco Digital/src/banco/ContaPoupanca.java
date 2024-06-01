package banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("-----Poupança-----");
		super.imprimirInfosComuns();		
	}

	@Override
	public int geraCartao() {
		return super.geraCartao();
		
	}
	
	

}
