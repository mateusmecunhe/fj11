package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("você não pode sacar um valor negativo");
		} if (this.saldo<valor){
			throw new SaldoInsuficienteException();
		}  
			this.saldo -= (valor + 0.10);
			
	}

	

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {

		return this.getSaldo() * 0.01;
	}

}
