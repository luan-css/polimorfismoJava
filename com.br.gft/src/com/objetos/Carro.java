package com.objetos;

public class Carro extends Veiculo 
{
	private String marca;
	private int portas;
	private int ano;
	
	public Carro(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, int passageiros) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco, passageiros);
		// TODO Auto-generated constructor stub
	}





	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}


	@Override
	public void acelerar() {
		if (isLigado == true) {
			velocidade += 50;
			litrosCombustivel -= 5;
			System.out.println("Você Acelerou o carro e está a " + velocidade +" KM/h");
		}else {
			System.out.println("Carro desligado");
		}
			
	}

	@Override
	public void frear() {
		if (isLigado == true && velocidade > 0) {
			velocidade -= 5;
			System.out.println("Voce freiou e agora está a " + velocidade + "KM/h");
		}else {
			System.out.println("Carro desligado");
		}
		
	}



	@Override
	public void abastecer(int qtdLitros) {
		if (litrosCombustivel >= 100){
			System.out.println("Carro cheio");
		}else {
			if(litrosCombustivel + qtdLitros >= 100) {
				System.out.println("Abastecido 100%");
				litrosCombustivel = 100;
			}else {
				this.litrosCombustivel += qtdLitros;
				System.out.println(qtdLitros);
			}
		}
	}




	
	
}
