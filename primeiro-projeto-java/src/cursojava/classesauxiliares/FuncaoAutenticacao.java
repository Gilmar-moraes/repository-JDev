package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/**
 * Realmente e somente receber alguém que tenha o contrato
 *  da interface de PermitirAcesso e chamar o autenticar
 * @author Junior
 *
 */
public class FuncaoAutenticacao {

	private PermitirAcesso acesso;
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		super();
		this.acesso = acesso;
	}

	public boolean autenticar() {
		return acesso.autenticar();
	}
}
