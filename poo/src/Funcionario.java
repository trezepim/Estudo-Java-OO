
public class Funcionario extends Pessoa{
	private int matricula;
	private String cargo;
	private double salario;
	
	public Funcionario() {
		super();
		this.matricula = 0;
		this.cargo = "";
		this.salario = 0;
	}
	
	public Funcionario(String nome, int idade, char sexo, int matricula, String cargo, double salario) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + ", matricula = " + matricula + ", cargo = " + cargo + ", salario = " + salario;
	}
	
}
