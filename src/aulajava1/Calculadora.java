package aulajava1;

public class Calculadora {

	int valorPadraoMultiplicacao = 2;
	
	
	
	// float eu consigo atribuir valor inteiro
	float valorPadraoSoma = 3.3f;
	
	int valorPadraoSomaInteiro = (int) 3.4f;
	
	
	
	
	public int realizarMultiplicacao(int valor) {
		
		
		return valor * this.valorPadraoMultiplicacao;
		
	}
	

	public float realizarSoma(int valor) {
		
		
		return valor + this.valorPadraoSoma;
		
		
	}
	
	
}
	