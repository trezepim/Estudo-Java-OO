import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jogador jogador1 = new Jogador("Gabigol");
		Jogador jogador2 = new Jogador("Zico");
		Jogador jogador3 = new Jogador(" ");
		int tamVet = 3;
		
		System.out.println("Informe o nome do terceiro jogador: ");
		String nome = sc.nextLine();
		jogador3.setNome(nome);
		
		Jogador[] jogadores = new Jogador[3];
		
		jogadores[0] = jogador1;
		jogadores[1] = jogador2;
		jogadores[2] = jogador3;
		
		for (Jogador jogador : jogadores) {
			jogador.imprimir();
		}
		
		System.out.println("Informe o índice do jogador que deseja remover: ");
		System.out.println("0 - " + jogador1.getNome());
		System.out.println("1 - " + jogador2.getNome());
		System.out.println("2 - " + jogador3.getNome());
		int escolha = sc.nextInt();
		
		jogadores[escolha] = jogadores[tamVet - 1];
		tamVet -= 1;
		
		System.out.println("Jogador removido");
		
		for(int i = 0; i < tamVet; i++) {
			jogadores[i].imprimir();
		}
		
		sc.close();
	}
}
