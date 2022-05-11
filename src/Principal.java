

public class Principal {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente(new Cliente("Roberto"));
		Conta cp = new ContaPoupanca(new Cliente("Gabriel"));
		Banco banco = new Banco("Brasil");
		banco.addConta(cp);
		banco.addConta(cc);
		cc.depositar(100.0);
		cc.sacar(50.0);
		cc.transferir(20.0, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
