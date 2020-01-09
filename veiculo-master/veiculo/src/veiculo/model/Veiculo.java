package veiculo.model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public Veiculo() {
		this.velocidade = 0;
		this.km = 0;
		this.isLigado = true;
		this.litrosCombustivel = 60;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		if (this.isLigado == true) {
			velocidade += 20;
			litrosCombustivel -= 1;
		} else if (this.litrosCombustivel <= 0) {
			System.out.println("nao é possivel acelerar");
		} else {
			System.out.println("Não é possivel acelerar, o carro está desligado");
		}
	}

	public void frear() {
		if (this.isLigado == true && this.velocidade > 0) {
			velocidade -= 10;
		}
	}

	public void pintar(String pintura) {
		this.cor = pintura;
	}

	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("Carro ligado");
		} else {
			System.out.println(this.isLigado == true);
		}
	}

	public void desligar() {
		if (this.isLigado == true) {
			System.out.println("Carro desligado");
		} else {
			System.out.println("carro ligado");
		}
	}
	public void abastecer(int qtdlitros) {
		if (this.litrosCombustivel == 100) {
			System.out.println("combustivel cheio");
		} else if (qtdlitros >= 100 || this.litrosCombustivel >= 100) {
			System.out.println("Impossivel abastecer");
		} else {
			if(this.litrosCombustivel + qtdlitros >= 100);
				this.litrosCombustivel = 100;
		}

	}

}
