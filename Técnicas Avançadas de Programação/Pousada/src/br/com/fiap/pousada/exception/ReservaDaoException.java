package br.com.fiap.pousada.exception;

public class ReservaDaoException extends Exception {
	
	private static final long serialVersionUID = -3454103724064952548L;

	public ReservaDaoException() {
		this("Problema nos registros de reserva.");
	}
	
	public ReservaDaoException(String msg) {
		super(msg);
	}
}
