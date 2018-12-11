
public class TesteDaConta {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();

		c1.setTitular("Ana");
		c1.setAgencia("123-x");
		c1.setNumero(1122);
		c1.deposita(100);
		
		System.out.println(c1.getTitular());

	}
}
