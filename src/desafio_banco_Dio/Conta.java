package desafio_banco_Dio;

public abstract class Conta implements InterfaceConta{
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected double saldoCofre;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 1;
	private static  int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL ++;
		this.cliente = cliente;
	}
	
	public void consultarSaldo() {
		System.out.println("\n Saldo Atual: " + saldo);
	}
	
	@Override
	public void sacar(double saldo) {
		this.saldo-= saldo;
		
	}

	@Override
	public void depositar(double saldo) {
		this.saldo+= saldo;
	}

	@Override
	public void transferir(double saldo, Conta contaDestino) {
		this.sacar(saldo);
		contaDestino.depositar(saldo);
	}
	
	public void depositarSaldoCofre(double saldo) {
		if(this.saldo <= 0 || saldo > this.saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			this.saldo-= saldo;
			this.saldoCofre+=  saldo;
		}
	}
	
	public void resgatarSaldoCofre(double saldo) {
		if(saldoCofre <= 0 || saldo > saldoCofre) {
			System.out.println("Saldo insuficiente");
		}else {
			saldoCofre-= saldo;
			this.saldo+= saldo; 
		}
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getSaldoCaixinha() {
		return saldoCofre;
	}

	public void setSaldoCaixinha(double saldoCofre) {
		this.saldoCofre = saldoCofre;
	}

	protected void imprimirInfosComuns() {
		System.out.printf("Titular: %s ", this.cliente.getNome());
		System.out.printf("Agencia: %d ", this.agencia);
		System.out.printf("Conta: %d ", this.conta );
		System.out.printf("Saldo: %.2f", this.saldo);
		System.out.printf(" valor guardado no cofre: %.2f ", this.saldoCofre);
	}

}
