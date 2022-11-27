package cursojava.execultavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/*Main é um metodo auto executavel do java*/
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
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
		String alunoNota1 = JOptionPane.showInputDialog("Qual a primeira nota do aluno?");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2");
		String alunoNota2 = JOptionPane.showInputDialog("Qual a segunda nota do aluno?");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3");
		String alunoNota3 = JOptionPane.showInputDialog("Qual a terceira nota do aluno?");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4");
		String alunoNota4 = JOptionPane.showInputDialog("Qual a quarta nota do aluno?");
		
		/*
		 * Aluno1 é uma referência para o objeto aluno
		 * Objeto temos um real na memoria
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
		
		Disciplina disciplina10 = new Disciplina();
		disciplina10.setDisciplina("java");
		disciplina10.setNota(10);
		aluno1.getDisciplina().add(disciplina10);
		
		Disciplina disciplina11 = new Disciplina();
		disciplina11.setDisciplina("java ee");
		disciplina11.setNota(10);
		aluno1.getDisciplina().add(disciplina11);
		
		Disciplina disciplina12 = new Disciplina();
		disciplina11.setDisciplina("java se");
		disciplina11.setNota(12);
		aluno1.getDisciplina().add(disciplina12);
		
		Disciplina disciplina13 = new Disciplina();
		disciplina11.setDisciplina("java me");
		disciplina11.setNota(13);
		aluno1.getDisciplina().add(disciplina13);
		
		System.out.println("---------------------------------------");
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("Media das notas do aluno " + aluno1.getNome() + " é:" + aluno1.getMediaNotas());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Resprovado"));
		System.out.println("---------------------------------------");
	}

}
