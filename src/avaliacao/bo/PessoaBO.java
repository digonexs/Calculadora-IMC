package avaliacao.bo;

public class PessoaBO {
	
	//Método que calcula o IMC da pessoa
	public void calculoIMC(double peso, double altura) {
		
		double resultadoIMC = peso / (altura * altura);
		
		if(resultadoIMC < 18.5) {
			System.out.println("CLASSIFICAÇÃO: Magreza | OBESIDADE GRAU: 0 | IMC: "+ resultadoIMC);
		}else if(resultadoIMC  <= 24.9) {
			System.out.println("CLASSIFICAÇÃO: Normal | OBESIDADE GRAU: 0| IMC: "+ resultadoIMC);
		}else if( resultadoIMC <= 29.9) {
			System.out.println("CLASSIFICAÇÃO: SOBREPESO | OBESIDADE GRAU: I | IMC: "+ resultadoIMC);
		}else if(resultadoIMC <= 39.9) {
			System.out.println("CLASSIFICAÇÃO: OBESIDADE | OBESIDADE GRAU: II | IMC: "+ resultadoIMC);
		}else if(resultadoIMC > 39.9){
			System.out.println("CLASSIFICAÇÃO: OBESIDADE GRAVE | OBESIDADE GRAU: III | IMC: " +resultadoIMC);
		}
	}
}
