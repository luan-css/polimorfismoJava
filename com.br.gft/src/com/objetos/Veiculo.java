package com.objetos;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected String placa;
	protected String cor;
	protected float km;
	protected boolean isLigado;
	protected int litrosCombustivel;
	protected int velocidade;
	protected double preco;
	protected int passageiros;

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, int passageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
		this.passageiros =  passageiros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public abstract void acelerar();

	public void abastecer(int qtdLitros) {
		
	};
//	public abstract void abastecer(int qtdLitros);
//	public abstract void abastecer(float qtdLitros);
//	
	public abstract void frear();
	
	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("o veiculo já está ligado");
		}
		else {
			this.isLigado = true;
			System.out.println("você ligou o veiculo");
		}
	}
	
	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("o veiculo já está desligado");
		}
		else {
			this.isLigado = false;
			System.out.println("você desligou o veiculo");
		}
	}

	

}
