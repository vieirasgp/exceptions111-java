package model.exceptions;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) { //permitir a instanciacao da excecao personoalizada passando uma mensagem para ela
		super(msg);
	}
		
}
