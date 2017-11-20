package es.altair.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="clases")
public class Clases implements Serializable{
	@Id
	private int idClase;
	private String titulo;
	private String descripcion;
	private int num_horas;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="clases")
	private Set<Estudiantes> estudiantes= new HashSet<Estudiantes>();
	
	
	public Clases() {
		super();
	}
	public Clases(int idClase, String titulo, String descripcion, int num_horas) {
		super();
		this.idClase = idClase;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.num_horas = num_horas;
	}
	public int getIdClase() {
		return idClase;
	}
	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNum_horas() {
		return num_horas;
	}
	public void setNum_horas(int num_horas) {
		this.num_horas = num_horas;
	}
	public Set<Estudiantes> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(Set<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
