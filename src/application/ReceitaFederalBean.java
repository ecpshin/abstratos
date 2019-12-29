package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.ReceitaFederal;

public class ReceitaFederalBean {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<ReceitaFederal> lista = new ArrayList<>();
		
		System.out.print("Entre com número de contribuintes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=n;i++) {
			
			System.out.println("Dados do Contribuinte #" + i +": ");
			
			System.out.print("Pessoa Física ou Jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Receita: ");
			double receita = sc.nextDouble();
			sc.nextLine();
			
			if(ch == 'f') {
				System.out.print("Despesa com saúde: ");
				double despesa = sc.nextDouble();
				sc.nextLine();
				lista.add(new PessoaFisica(nome, receita, despesa));
			} else {
				System.out.print("Número de Funcionários: ");
				int numero = sc.nextInt();
				sc.nextLine();
				
				lista.add(new PessoaJuridica(nome, receita, numero));
			}
			System.out.println("");
		}//end for
		
		System.out.println();
		System.out.println("IMPOSTO PAGO: ");
		
		double total = 0.0;
		
		for (ReceitaFederal r : lista) {
		
			System.out.println(r.getNome() 
					  + ": " 
		              + String.format("$ %.2f", r.imposto()));
			total += r.imposto();
		}
		
		System.out.println("\nTOTAL DE IMPOSTOS:");
		System.out.println(String.format("$ %.2f", total));
		
		sc.close();

	}

}
