package avaliacao.bo;

public class PessoaBO {
	
	//M�todo que calcula o IMC da pessoa
	public void calculoIMC(double peso, double altura) {
		
		double resultadoIMC = peso / (altura * altura);
		
		if(resultadoIMC < 18.5) {
			System.out.println("CLASSIFICA��O: Magreza | OBESIDADE GRAU: 0 | IMC: "+ resultadoIMC);
		}else if(resultadoIMC  <= 24.9) {
			System.out.println("CLASSIFICA��O: Normal | OBESIDADE GRAU: 0| IMC: "+ resultadoIMC);
		}else if( resultadoIMC <= 29.9) {
			System.out.println("CLASSIFICA��O: SOBREPESO | OBESIDADE GRAU: I | IMC: "+ resultadoIMC);
		}else if(resultadoIMC <= 39.9) {
			System.out.println("CLASSIFICA��O: OBESIDADE | OBESIDADE GRAU: II | IMC: "+ resultadoIMC);
		}else if(resultadoIMC > 39.9){
			System.out.println("CLASSIFICA��O: OBESIDADE GRAVE | OBESIDADE GRAU: III | IMC: " +resultadoIMC);
		}
	}
}
