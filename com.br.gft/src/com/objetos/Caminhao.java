package com.objetos;

public class Caminhao extends Veiculo{
	private String uso;
	private String tipo;
	
	public Caminhao(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, int passageiros, String tipo, String uso) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco, passageiros);
		this.uso = uso;
		this.tipo = tipo;
	}
	


	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		if(isLigado == true) {
			velocidade += 30;
			litrosCombustivel -= 5;
			System.out.println("Voc� acelerou o Caminh�o e est� a " + velocidade + " KM/h");
		}else {
			System.out.println("Caminh�o desligado, nao � possivel acelerar");
		}
		
	}


	
	public void abastecer(float qtdLitros){
		if (litrosCombustivel >= 200) {
			System.out.println("Caminh�o cheio");
		} else {
			if (litrosCombustivel + (qtdLitros) >= 200) {
				System.out.println("Abastecido 100%");
			} else {
				litrosCombustivel += (qtdLitros);
				System.out.println(litrosCombustivel);
			}
		}

	}



	@Override
	public void frear() {
		if(isLigado == true && velocidade > 0) {
			velocidade -= 3;
			System.out.println("Voce freiou o caminh�o e est� a " + velocidade + "KM/h");
		}else {
			System.out.println("Caminh�o desligado ou n�o est� em andamento");
			}
		
	}




}


