package py.edu.facitec.clase1.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Post extends General {

	private String titulo;
	private String autor;
	private LocalDate fecha;
	private  String texto;
	
	@OneToMany(mappedBy ="post")
	private java.util.List<Comentario> comentarios;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public java.util.List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(java.util.List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Post [titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", texto=" + texto + "]";
	}
	
	
	
	
}
