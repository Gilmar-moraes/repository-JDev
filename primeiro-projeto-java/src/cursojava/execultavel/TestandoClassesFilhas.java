package cursojava.execultavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public abstract class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Gilmar");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Gilmar");
		diretor.setIdade(30);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Gilmar");
		secretario.setIdade(25);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + ":" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
	}

}
