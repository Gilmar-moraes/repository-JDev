package cursojava.execultavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.constantes.StatusAluno;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.excecao.ExcecaoProcessarNota;

public class PrimeiraClasseJava {

	/* Main ? um metodo auto executavel do java */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			lerArquivo();
			/*try {
				File fl = new File("arquivo.txt");
				Scanner sc = new Scanner(fl);
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				throw new ExcecaoProcessarNota("Erro no arquivo");
			}*/
			
			String login = JOptionPane.showInputDialog("Informe o Login:");
			String senha = JOptionPane.showInputDialog("Informe o Senha:");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> listAlunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 0; qtd <= 1; qtd++) {

					/* Entrada de dados pelo usuario */
					String alunoNome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
					String alunoIdade = JOptionPane.showInputDialog("Qual o idade do aluno?");
					String alunoNascimento = JOptionPane.showInputDialog("Qual a data de Nascimento do aluno?");
					String alunoRG = JOptionPane.showInputDialog("Qual o RG do aluno?");
					String alunoCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
					String alunoMae = JOptionPane.showInputDialog("Qual o nome da M?e do aluno?");
					String alunoPai = JOptionPane.showInputDialog("Qual o nome do Pai do aluno?");

					String dataMatriculaAluno = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
					String serieAluno = JOptionPane.showInputDialog("Qual a serie do aluno?");
					String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");

					/*
					 * Aluno1 ? uma refer?ncia para o objeto aluno Objeto temos um real na memoria
					 */
					Aluno aluno1 = new Aluno();
					aluno1.setNome(alunoNome);
					aluno1.setIdade(Integer.valueOf(alunoIdade));
					aluno1.setDataNascimento(alunoNascimento);
					aluno1.setRegistroGeral(alunoRG);
					aluno1.setNumeroCpf(alunoCpf);
					aluno1.setNomeMae(alunoMae);
					aluno1.setNomePai(alunoPai);

					aluno1.setDataMatricula(dataMatriculaAluno);
					aluno1.setSerieMatriculado(serieAluno);
					aluno1.setNomeEscola(nomeEscola);

					/**
					 * Adicionar disciplina na lista de disciplina do aluno
					 **/
					for (int pos = 1; pos <= 4; pos++) {

						String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina" + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da Disciplina:" + pos + "?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplina().add(disciplina);
					}

					/**
					 * Removendo disciplina da lista de disciplina do aluno
					 **/
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover?");
							aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null,
									"Continuar a remover alguma disciplina?");
						}
					}

					listAlunos.add(aluno1);
				} // fim do for

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : listAlunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO);
					} else {
						maps.get(StatusAluno.REPROVADO);
					}
				}

				System.out.println("--------------------Lista Aprovados----------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com a m?dia de = " + aluno.getMediaNotas());
				}

				System.out.println("--------------------Lista Recupera??o----------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com a m?dia de = " + aluno.getMediaNotas());
				}

				System.out.println("--------------------Lista Reprovados----------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + " com a m?dia de = " + aluno.getMediaNotas());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso n?o permitido");
			}

		} catch (NumberFormatException e) {
			// TODO: handle exception
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			
			System.out.println("Mensagem : " + e.getMessage());
			
			for (int i = 0; i <= e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n M?todo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de convers?o de n?mero" + saida.toString());
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Erro de referecia nula de n?mero" + e.getClass());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
		} finally {
			System.out.println("? isso!!");
		}
	}
	
	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File fl = new File("arquivo.txt");
			Scanner sc = new Scanner(fl);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}
}