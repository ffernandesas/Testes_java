
public class TesteNovaConta {
	public static void main(String[] args) {
		
		Conta contaNova2 = new Conta();
		System.out.println(contaNova2.getSaldo());
		
		contaNova2.titular = new Cliente();
		System.out.println(contaNova2.titular);
		
		contaNova2.titular.nome = "Marcela";
		System.out.println(contaNova2.titular.nome);			
	}
	
}
