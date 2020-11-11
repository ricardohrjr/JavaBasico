/**
 * 
 */
package aulajava1;

/**
 * @author Casa
 *
 */
public class SomandoValores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int valor1 = 7;
		int valor2 = 5;
		boolean eMaior = false
				
				
		int soma = valor1 + valor2;
				
				
		// com uso do if
				
		System.out.println(valor1 > valor2);
		
		if(valor1 > valor2) {
			soma = soma + 2;
			eMaior = true;
			
			
		} else if (valor1 < valor2) {
			soma = - 5;
		}
		
		System.out.println(("" + valor1).concat(" + " + valor2).concat(" = " + soma));
		
		
		
		
		
			
	}

}
