import lombok.Getter;

@Getter
public abstract class Conta {
	protected static final int AGENCIA_PADRAO = 1;
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;

	protected Conta(int agencia, int numero, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		if(saldo >= valor)
			saldo = saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void transferir(double valor, Conta contaDestido) {
		if(saldo >= valor) {
			//Não usei o sacar porque caso o valor seja maior que o saldo, ele não iria sacar mas iria depositar na conta destino
			saldo = saldo - valor;
			contaDestido.depositar(valor);
		}
	}
	
	public abstract void imprimirExtrato();
}
