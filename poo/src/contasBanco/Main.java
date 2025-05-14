package contasBanco;

public class Main {

	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setNumConta(001);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.estadoAtual();
		
		Conta p2 = new Conta();
		p2.setNumConta(002);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.estadoAtual();
		p2.sacar(100);
		p2.estadoAtual();
	}

}
