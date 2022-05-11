

public class ContaCorrente extends Conta {
	
	private static int SEQUENCIAL = 1;

	protected ContaCorrente(Cliente cliente) {
		super(AGENCIA_PADRAO, SEQUENCIAL, cliente);
		SEQUENCIAL++;
	}

	@Override
	public void imprimirExtrato()  {
		System.out.println("===EXTRATO CONTA CORRENTE===");
		System.out.println("AGENCIA: "+getAgencia());
		System.out.println("NUMERO: "+getNumero());
		System.out.println("CLIENTE: "+getCliente());
		System.out.println("SALDO: "+getSaldo());
	}	
}
