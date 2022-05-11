import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<>();
	}

	public void addConta(Conta conta) {
		contas.add(conta);
	}
}
