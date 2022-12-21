package cursojava.classes;

import java.util.Objects;

public class Secretario extends Pessoa{

	private String registro;
	private String nivelCargo;
	private String expareincia;
	
	private void Scretario() {
		// TODO Auto-generated method stub

	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExpareincia() {
		return expareincia;
	}

	public void setExpareincia(String expareincia) {
		this.expareincia = expareincia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(expareincia, nivelCargo, registro);
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
		Secretario other = (Secretario) obj;
		return Objects.equals(expareincia, other.expareincia) && Objects.equals(nivelCargo, other.nivelCargo)
				&& Objects.equals(registro, other.registro);
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", expareincia=" + expareincia + "]";
	}
}
