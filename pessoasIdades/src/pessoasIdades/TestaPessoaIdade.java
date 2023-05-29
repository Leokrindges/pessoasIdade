package pessoasIdades;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoaIdade {

	public static void main(String[] args) {
		// criando objeto da classe scanner
		Scanner leia = new Scanner(System.in);
		
		// criando arrayList de Pessoa
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		// declarando variaveis
		int pessoaMaisVelha = 0;
		int pessoaMaisNova = 115;
		String nomePessoaVelha = "";
		String nomePessoaNova = "";
		// inicializando contador com 0
		int contador = 0;

		do {// instanciando 10 objetos
			Pessoa pessoa = new Pessoa();
			System.out.print("Digite o seu nome: ");
			pessoa.setNome(leia.next());
			System.out.print("Digite a sua idade: ");
			pessoa.setIdade(leia.nextInt());
			// adicionando o objeto pessoa ao arrayList lista
			lista.add(pessoa);
			contador++;
			// condicional para saber quem tem a maior/menor idade e qual o nome dessa
			// pessoa
			if (pessoa.getIdade() > pessoaMaisVelha) {
				pessoaMaisVelha = pessoa.getIdade();
				nomePessoaVelha = pessoa.getNome();
			} else if (pessoa.getIdade() < pessoaMaisNova) {
				pessoaMaisNova = pessoa.getIdade();
				nomePessoaNova = pessoa.getNome();
			}
		} while (contador < 4);

		// imprime os nomes e idades cadastrados na lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		// imprime quem é a mais velha e mais nova da lista
		System.out.println(nomePessoaVelha + "é a pessoa mais velha, com " + pessoaMaisVelha + " anos.");
		System.out.println(nomePessoaNova + "é a pessoa mais nova, com " + pessoaMaisNova + " anos.");
	}
}
