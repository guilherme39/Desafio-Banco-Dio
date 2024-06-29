package desafio_banco_Dio;

public  class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" EXtrato Conta Poupança ***** ");
		imprimirInfosComuns();
	}
}
