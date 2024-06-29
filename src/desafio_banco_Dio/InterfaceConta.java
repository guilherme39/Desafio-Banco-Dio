package desafio_banco_Dio;

public interface InterfaceConta {
	 void sacar(double saldo);
	 void depositar(double saldo);
	 void transferir(double saldo,Conta contaDestino);
	 void imprimirExtrato();
}
