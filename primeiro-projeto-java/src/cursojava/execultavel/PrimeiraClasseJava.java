package cursojava.execultavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um metodo auto executavel do java */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Entrada de dados pelo usuario
		 */
		String alunoNome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String alunoIdade = JOptionPane.showInputDialog("Qual o idade do aluno?");
		String alunoNascimento = JOptionPane.showInputDialog("Qual a data de Nascimento do aluno?");
		String alunoRG = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String alunoCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String alunoMae = JOptionPane.showInputDialog("Qual o nome da Mãe do aluno?");
		String alunoPai = JOptionPane.showInputDialog("Qual o nome do Pai do aluno?");

		String dataMatriculaAluno = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
		String serieAluno = JOptionPane.showInputDialog("Qual a serie do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");

		/*
		 * Aluno1 é uma referência para o objeto aluno Objeto temos um real na memoria
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
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover?");
			aluno1.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}

		System.out.println("---------------------------------------");
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Media das notas do aluno " + aluno1.getNome() + " é:" + aluno1.getMediaNotas());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Resprovado"));
		System.out.println("---------------------------------------");
	}

}
