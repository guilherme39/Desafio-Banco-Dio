package desafio_banco_Dio;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" EXtrato Conta Corrente ***** ");
		imprimirInfosComuns();
	}

}
