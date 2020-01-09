package com.objetos;

public class Aviao extends Veiculo {
	private String tipo;
	private String uso;

	public Aviao(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, int passageiros, String tipo, String uso) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco, passageiros);
		this.uso = uso;
		this.tipo = tipo;
	}



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	@Override
	public void acelerar() {
		if(isLigado == true) {
			velocidade += 1000;
			litrosCombustivel -= 50;
			System.out.println("Você acelerou o Avião e está a " + velocidade + " KM/h");
		}else {
			System.out.println("Avião desligado, nao é possivel acelerar");
		}
			

	}

	public void abastecer(String qtdLitros) {
		if (litrosCombustivel >= 1000) {
			System.out.println("Avião cheio");
		} else {
			if (litrosCombustivel + Integer.parseInt(qtdLitros) >= 1000) {
				System.out.println("Abastecido 100%");
				litrosCombustivel = 1000;
			} else {
				litrosCombustivel += Integer.parseInt(qtdLitros);
				System.out.println("Voce abasteceu " + qtdLitros + " Litros");
				//System.out.println("Voce abasteceu ");
			}
		}

	}



	@Override
	public void frear() {
		if(isLigado == true && velocidade > 0) {
			velocidade -= 100;
			System.out.println("Voce desacelerou o avião e agora está a " + velocidade + " KM/h");
		}else {
			System.out.println("Avião desligado ou nao está voando");
		}
		
	}

}
