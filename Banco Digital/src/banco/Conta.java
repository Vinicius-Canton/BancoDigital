package banco;

import java.util.Random;

public abstract class Conta implements IConta{
	private static final int AGENCIA_PADAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected long cartao;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgenca() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int geraCartao() {
		Random randomNumbers = new Random();
		cartao = Math.abs(randomNumbers.nextLong());
		
		return (int) cartao;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Cartão: %d", this.cartao));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
