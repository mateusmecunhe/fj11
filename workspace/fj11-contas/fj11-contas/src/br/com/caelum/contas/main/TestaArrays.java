package br.com.caelum.contas.main;

import java.util.Collections;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100);
			
			System.out.println(conta.getSaldo());

			
			
			
		}
		
		for (Conta conta : contas){
			System.out.println(conta.getSaldo());
		}
		
//		for (int j = 0; j<contas.length; j++){
	//			System.out.println(contas[j].getSaldo());
	// }		
		
	

			
		

	}
}
