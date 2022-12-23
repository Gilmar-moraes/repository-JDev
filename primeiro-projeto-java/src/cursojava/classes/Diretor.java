package cursojava.classes;

import java.util.Objects;

public class Diretor extends Pessoa{

	private String regitroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	public Diretor() {}

	public String getRegitroEducacao() {
		return regitroEducacao;
	}

	public void setRegitroEducacao(String regitroEducacao) {
		this.regitroEducacao = regitroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(regitroEducacao, tempoDirecao, titulacao);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(regitroEducacao, other.regitroEducacao) && tempoDirecao == other.tempoDirecao
				&& Objects.equals(titulacao, other.titulacao);
	}

	@Override
	public String toString() {
		return "Diretor [regitroEducacao=" + regitroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
}
