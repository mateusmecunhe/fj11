package br.com.caelum.contas.modelo;

/**
 * Classe responsavel por moldar as contas
 * 
 * @author Mateus
 * 
 */
public class Conta implements Comparable<Conta>{
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	


	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar " + "um valor negativo");
		} else {
			this.saldo += valor;
		}
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

	public String getTipo(){
	return "Conta";
	 }

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "[titular=" + this.titular + ", número=" + this.numero + ", agencia=" + this.agencia + "saldo= " + this.saldo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Conta outraConta){
		return this.titular.compareTo(outraConta.titular);
	}

}
