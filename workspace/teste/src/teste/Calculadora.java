package teste;

public class Calculadora extends Operacao {
	public static void main(String[] args) {
try {
	
		
			double valor1 = Double.parseDouble(args[0]);
			double valor2 = Double.parseDouble(args[1]);
		


		System.out.println("somando: " + Operacao.somar(valor1, valor2));
		System.out.println("dividindo: " + Operacao.dividir(valor1, valor2));
		System.out.println("multiplicando: " + Operacao.multiplicar(valor1, valor2));
		System.out.println("subtraindo: " + Operacao.subtrair(valor1, valor2));
	}catch(NumberFormatException e){ 
		System.out.println("digite um número, querido usuário");
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("digite dois números");
	}

	}

}
