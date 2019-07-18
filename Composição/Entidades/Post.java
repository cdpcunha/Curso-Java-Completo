package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	private Date momento;
	private String titulo;
	private String texto;
	private int likes;
	private List<Comentario> comentList = new ArrayList<>();

	public Post(Date momento, String titulo, String texto, int likes) {
		super();
		this.momento = momento;
		this.titulo = titulo;
		this.texto = texto;
		this.likes = likes;
	}

	public Post() {
	}

	public Date getMomento() {
		return momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getLikes() {
		return likes;
	}

	public List<Comentario> getComent() {
		return comentList;
	}
	
	public void addComentario (Comentario comentario) {
		comentList.add(comentario);
	}
	public void remComentario (Comentario comentario) {
		comentList.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Post \nMomento = " + sdf.format(momento));
		sb.append("\nTitulo = " + titulo);
		sb.append("\nTexto = " + texto);
		sb.append("\nLikes = " + likes);
		sb.append("\nComentarios = \n");  
		for(Comentario c : comentList) {
			sb.append(c.getTexto() + "\n");
				};
		return sb.toString();
	}
}
