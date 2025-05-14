import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa("Maria", 22, 'F');
		Funcionario funcionario1 = new Funcionario("Fabio", 19, 'M', 001, "Motoboy", 10000);
		
		Pessoa vetPessoa[] = new Pessoa[3];
		Funcionario vetFunc[] = new Funcionario[3];
		
		vetPessoa[0] = pessoa1;
		vetFunc[0] = funcionario1;
		
		System.out.println(pessoa1);
		System.out.println(funcionario1);
		}
	}