package banco;

public class BancoDigital {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Andre", 12);
		
		Conta cc = new ContaCorrente(c1);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(c1);
		cc.transferir(100, poupanca);
		cc.geraCartao();
		poupanca.geraCartao();
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
