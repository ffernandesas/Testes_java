
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente fabio = new Cliente();
		
		fabio.nome = "Fabio Santos";
		fabio.cpf = "000.000.000-00";
				
		Conta contaNova = new Conta();
		contaNova.deposita(100);
		
		
		contaNova.titular = fabio;
		System.out.println(contaNova.titular.nome);
		System.out.println(contaNova.titular);
		System.out.println(fabio);
	}

}
