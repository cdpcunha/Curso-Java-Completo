package Entidades;

public class Comentario {
	String texto;

	public Comentario(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String toString() {
		return this.getTexto() +"\n";
	}
}
