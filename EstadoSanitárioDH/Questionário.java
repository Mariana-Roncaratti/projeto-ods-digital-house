package EstadoSanitárioDH;

import java.util.Scanner;

import EstadoSanitário.Pessoa;
import EstadoSanitário.Problemas;

public class Questionário {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		Problemas problemas = new Problemas();

		Boolean correto = false;

		// Dados
		System.out.println("\nQual é o seu nome? ");
		pessoa.setNome(leia.nextLine());

		System.out.println("\nQual é o seu CPF? ");
		pessoa.setCpf(leia.nextLine());

		System.out.println("\nQual é a sua cidade? ");
		pessoa.setCidade(leia.nextLine());

		// Pergunta 1
		do {
			System.out.println("\n1. Quantas pessoas moram na casa?  ");
			int numMoradores = leia.nextInt();

			if (numMoradores >= 0) {
				correto = true;
				problemas.setNumMoradores(numMoradores);// Altera o número de moradores de acordo com a resposta do
														// usuário (Atribui a classe)
				problemas.calculaPontuacaoMoradores(numMoradores);// Método que calcula a pontuação do questionário
			} else {
				System.out.println("\nTente novamente! \nDigite um número válido... ");
			}

		} while (correto == false);

		// Pergunta 2
		correto = false;
		do {
			System.out.println(
					"\n2. Vocês costumam ter problemas com a água que utilizam em sua casa? (Responda com S ou N)");
			Character problemaAgua = leia.next().charAt(0);

			if (problemaAgua == 'S' || problemaAgua == 's') {
				problemas.setProblemaAgua(problemaAgua);
				problemas.somaPontuacao(problemaAgua);
				correto = true;
			} else if (problemaAgua == 'N' || problemaAgua == 'n') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");
			}

		} while (correto == false);

		// Pergunta 3
		correto = false;
		do {
			System.out.println("\n3. Para onde vai o esgoto de sua casa? Escolha uma das opções abaixo: ");

			System.out.println("\n\t1. Encanado para o rio");
			System.out.println("\t2. Fossa séptica");
			System.out.println("\t3. Encanado para estação de tratamento de esgoto");
			System.out.println("\t4. Fossa negra");
			System.out.println("\t5. Corre a céu aberto");

			int esgoto = leia.nextInt();

			switch (esgoto) {
			case 1:
				problemas.pontuacaoSoma(esgoto);
				correto = true;
				break;
			case 2:
				problemas.pontuacaoSoma(esgoto);
				correto = true;
				break;
			case 3:
				correto = true;
				break;
			case 4:
				problemas.pontuacaoSoma(esgoto);
				correto = true;
				break;
			case 5:
				problemas.pontuacaoSoma(esgoto);
				correto = true;
				break;
			default:
				System.out.println("\nNúmero inválido! \nEscolha um número de 1 a 5...");
			}
		} while (correto == false);

		// Pergunta 4

		correto = false;
		do {
			System.out.println("\n4. Na sua rua, você sente cheiro de esgoto? (Responda com S ou N)");
			Character cheiro = leia.next().charAt(0);

			if (cheiro == 'S' || cheiro == 's') {
				problemas.setCheiro(cheiro);
				problemas.somaPontuacao(cheiro);
				correto = true;
			} else if (cheiro == 'N' || cheiro == 'n') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");

			}

		} while (correto == false);

		// Pergunta 5
		correto = false;
		do {
			System.out.println("\n5. Quando chove, sua rua fica alagada? (Responda com S ou N)");
			Character alaga = leia.next().charAt(0);

			if (alaga == 'S' || alaga == 's') {
				problemas.setAlaga(alaga);
				problemas.somaPontuacao(alaga);
				correto = true;
			} else if (alaga == 'N' || alaga == 'n') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");

			}

		} while (correto == false);

		// Pergunta 6
		correto = false;
		do {
			System.out.println(
					"\n6. Na sua rua, você vê lixo nas grades de drenagem ou bocas-de-lobo, após as chuvas? (Responda com S ou N)");
			Character lixo = leia.next().charAt(0);

			if (lixo == 'S' || lixo == 's') {
				problemas.setLixo(lixo);
				problemas.somaPontuacao(lixo);
				correto = true;
			} else if (lixo == 'N' || lixo == 'n') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");

			}

		} while (correto == false);

		// Pergunta 7
		correto = false;
		do {
			System.out.println("\n7. O que é feito com o lixo produzido em sua casa? Escolha uma das opções abaixo: ");

			System.out.println("\n\t1. Coletado");
			System.out.println("\t2. Queimado");
			System.out.println("\t3. Enterrado");
			System.out.println("\t4. Jogado");
			System.out.println("\t5. Levado para a caçamba");

			int destinoLixo = leia.nextInt();

			switch (destinoLixo) {
			case 1:
				correto = true;
				break;
			case 2:
				problemas.pontuacaoSoma(destinoLixo);
				correto = true;
				break;
			case 3:
				problemas.pontuacaoSoma(destinoLixo);
				correto = true;
				break;
			case 4:
				problemas.pontuacaoSoma(destinoLixo);
				correto = true;
				break;
			case 5:
				problemas.pontuacaoSoma(destinoLixo);
				correto = true;
				break;
			default:
				System.out.println("\nNúmero inválido! \nEscolha um número de 1 a 5...");
				break;
			}
		} while (correto == false);

		// Pergunta 8 (resposta ao contrário)
		correto = false;
		do {
			System.out.println("\n8. A coleta de lixo ocorre de forma regular em sua rua? (Responda com S ou N)");
			Character coletaRegular = leia.next().charAt(0);

			if (coletaRegular == 'N' || coletaRegular == 'n') {
				problemas.setColetaRegular(coletaRegular);
				problemas.somaPontuacao(coletaRegular);
				correto = true;
			} else if (coletaRegular == 'S' || coletaRegular == 's') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");

			}

		} while (correto == false);

		// Pergunta 9 (resposta ao contrário)
		correto = false;
		do {
			System.out.println(
					"\n9. Você está satisfeito com o serviço de coleta de lixo da sua rua? (Responda com S ou N)");
			Character satisfacaoColeta = leia.next().charAt(0);

			if (satisfacaoColeta == 'N' || satisfacaoColeta == 'n') {
				problemas.setSatisfacaoColeta(satisfacaoColeta);
				problemas.somaPontuacao(satisfacaoColeta);
				correto = true;
			} else if (satisfacaoColeta == 'S' || satisfacaoColeta == 's') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");

			}

		} while (correto == false);

		// Pergunta 10
		correto = false;
		do {
			System.out.println(
					"\n10. Alguém na sua família apresentou alguma doença ou algum tipo de problema que possa estar relacionado com a água, com o lixo, com o esgoto ou com chuvas? (Responda com S ou N)");
			Character doencaFamilia = leia.next().charAt(0);

			if (doencaFamilia == 'S' || doencaFamilia == 's') {
				problemas.setDoencaFamilia(doencaFamilia);
				problemas.somaPontuacao(doencaFamilia);
				correto = true;
			} else if (doencaFamilia == 'N' || doencaFamilia == 'n') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");

			}

		} while (correto == false);

		// Pergunta 11 (resposta ao contrário)
		correto = false;
		do {
			System.out.println("\n11. Na sua rua ocorre o serviço de varrição? (Responda com S ou N)");
			Character varricao = leia.next().charAt(0);

			if (varricao == 'N' || varricao == 'n') {
				problemas.somaPontuacao(varricao);
				correto = true;
			} else if (varricao == 'S' || varricao == 's') {
				correto = true;
			} else {
				System.out.println("\nTente novamente! \nDigite S ou N... ");
			}

			problemas.setVarricao(varricao);

		} while (correto == false);

		// Pergunta 12 (resposta ao contrário)
		correto = false;

		if (problemas.getVarricao() == 'S' || problemas.getVarricao() == 's') {

			do {
				System.out.println("\n12. Se sim, está satisfeito com o serviço de varrição? (Responda com S ou N)");
				Character satisfacaoVarricao = leia.next().charAt(0);

				if (satisfacaoVarricao == 'N' || satisfacaoVarricao == 'n') {
					problemas.setSatisfacaoVarricao(satisfacaoVarricao);
					problemas.somaPontuacao(satisfacaoVarricao);
					correto = true;
				} else if (satisfacaoVarricao == 'S' || satisfacaoVarricao == 's') {
					correto = true;
				} else {
					System.out.println("\nTente novamente! \nDigite S ou N... ");
				}

			} while (correto == false);
		}

		if (problemas.getPontuacao() > 0 && problemas.getPontuacao() <= 5) {
			System.out.println("\nFim do questionário!\n\n" + pessoa.getNome() + " (" + pessoa.getCpf()
					+ "), sua classificação de saneamento básico é: Bom! (" + problemas.getPontuacao() + " pontos).");
		} else if (problemas.getPontuacao() >= 6 && problemas.getPontuacao() <= 8) {
			System.out.println("\nFim do questionário!\n\n" + pessoa.getNome() + " (" + pessoa.getCpf()
					+ "), sua classificação de saneamento básico é: Regular! (" + problemas.getPontuacao()
					+ " pontos).");
		} else if (problemas.getPontuacao() >= 9 && problemas.getPontuacao() <= 14) {
			System.out.println("\nFim do questionário!\n\n" + pessoa.getNome() + " (" + pessoa.getCpf()
					+ "), sua classificação de saneamento básico é: Ruim! (" + problemas.getPontuacao() + " pontos).");
		}
	}
}
