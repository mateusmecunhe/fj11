package br.com.caelum.contas.modelo;
/**
 * Classe responsavel por moldar as contas
 * @author Mateus
 * 
 */
public abstract class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	 public abstract String getTipo();
//		return "Conta";
//	}
	
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
	@Override
	public String toString(){
		return "[titular=" + this.titular + ", número=" + this.numero + ", agencia=" + this.agencia + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj == null){ 
			return false;
		}
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero &&
				this.agencia.equals(outraConta.agencia);
	}
	


}
