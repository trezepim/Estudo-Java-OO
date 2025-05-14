package contasBanco;

public class Conta {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status : " + this.getStatus());
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		
		if(t.equals("CC")) {
			this.setSaldo(50);
		}else if (t.equals("CP")) {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Seu saldo de: R$" + saldo + " foi sacado e sua conta foi fechada.");
		}else if(this.getSaldo() == 0) {
			System.out.println("Conta fechada com sucesso");
		}else {
			System.out.println("Não é possível fechar sua conta porque você está em débito.");
		}
	}
	
	public void depositar(double v) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado");
		}else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	
	public void sacar(double v) {
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado");
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
		}else {
			System.out.println("Impossível sacar");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if(this.getTipo() == "CC") {
			v = 12;
		}else if(this.getTipo() == "CP") {
			v = 20;
		}
		
		if(this.getStatus()) {
			if(this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso");
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossível pagar uma conta fechada");
		}
	}
}
