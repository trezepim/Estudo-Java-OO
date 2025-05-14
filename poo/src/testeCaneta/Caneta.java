package testeCaneta;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected double carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	protected void rabiscar() {
		if(this.tampada) {
			System.out.println("ERRO! Não posso rabiscar");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	/*
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	*/
	
}
