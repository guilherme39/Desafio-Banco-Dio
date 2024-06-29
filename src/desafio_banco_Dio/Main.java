package desafio_banco_Dio;

public class Main {

	public static void main(String[] args) {
		
		Cliente guilherme = new Cliente();
		Cliente gleyce = new Cliente();
		
		guilherme.setNome("guilherme");
		gleyce.setNome("gleyce");
		
		Conta contaCorrente = new ContaCorrente(guilherme);
		Conta contaPoupanca = new ContaPoupanca(gleyce);
		
		contaCorrente.depositar(500);
		
		contaCorrente.depositarSaldoCofre(500);
		contaCorrente.resgatarSaldoCofre(400);
		
		contaCorrente.consultarSaldo();
		
		contaCorrente.transferir(250, contaPoupanca);
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		

	}

}
