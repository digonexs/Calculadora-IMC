package avaliacao.main;

import java.util.Scanner;

import avaliacao.bean.Pessoa;
import avaliacao.bo.PessoaBO;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++){
			Pessoa pessoa = new Pessoa();
		
			System.out.println("Informe seu nome: ");
			String nome = ler.next();
			pessoa.setNome(nome);
			
			System.out.println("Informe o PESO(em KG): ");
			double peso = ler.nextDouble();
			pessoa.setPeso(peso);  
			
			System.out.println("Informe a ALTURA(em metros): ");
			double altura = ler.nextDouble();
			pessoa.setAltura(altura);
			
			System.out.println("Informe a idade: ");
			int idade = ler.nextInt();
			pessoa.setIdade(idade);
    	    
			PessoaBO pessoaBO = new PessoaBO();
			pessoaBO.calculoIMC(peso, altura);	
		}
	}
}
