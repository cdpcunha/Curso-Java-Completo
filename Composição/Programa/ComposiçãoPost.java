package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entidades.Comentario;
import Entidades.Post;


public class Composi��oPost {

	public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
	Comentario com1 = new Comentario("Nossa que legal em");
	Comentario com2 = new Comentario("Boa viagem manim");
	Comentario com3 = new Comentario("Deus me livre mas quem me dera");
	Comentario com4 = new Comentario("To na BR050 tamb�m, bora encontrar");
	
	Post post1 = new Post(sdf.parse("08/05/2019 15:22:35"), "Viajei na Maionese Zel�ndia", "Ceis pira nessa porra kkkkkkk", 99);
	post1.addComentario(com1);
	post1.addComentario(com2);
	
	Post post2 = new Post(sdf.parse("31/12/2019 23:35:30"), "Quase come�ando o ano novo", "A fam�lia ja dormiu tudo, to sozim na rodovi�ria", 3);
	post2.addComentario(com3);
	post2.addComentario(com4);
	
	System.out.println(post1);
	System.out.println(post2);
	}

}
