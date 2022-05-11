

public class ContaPoupanca extends Conta {
	
	private static int SEQUENCIAL = 1;

	protected ContaPoupanca(Cliente cliente) {
		super(AGENCIA_PADRAO, SEQUENCIAL, cliente);
		SEQUENCIAL++;
	}

	@Override
	public void imprimirExtrato()  {
		System.out.println("===EXTRATO CONTA POUPANCA===");
		System.out.println("AGENCIA: "+getAgencia());
		System.out.println("NUMERO: "+getNumero());
		System.out.println("CLIENTE: "+getCliente());
		System.out.println("SALDO: "+getSaldo());
	}
}