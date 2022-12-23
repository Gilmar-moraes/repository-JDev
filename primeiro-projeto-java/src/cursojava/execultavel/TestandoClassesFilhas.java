package cursojava.execultavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public abstract class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Gilmar");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Gilmar");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Gilmar");
	}

}
