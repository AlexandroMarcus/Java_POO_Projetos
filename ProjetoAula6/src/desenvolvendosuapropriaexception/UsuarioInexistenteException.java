package desenvolvendosuapropriaexception;

public class UsuarioInexistenteException extends Exception{
	public UsuarioInexistenteException(String mensagem) {
		super(mensagem);
	}
}
