package es.altair.hibernatehos.bean;

import java.io.Serializable;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="paciente")
public class Paciente implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPaciente;
	private String nombre;
	private String dni;
	private int telefono;
	
	@OneToMany(mappedBy="paciente", cascade=CascadeType.ALL)
	private HashSet<Cita> citas;

	public Paciente() {
		super();
	}

	

	public Paciente(String nombre, String dni, int telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}



	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public HashSet<Cita> getCitas() {
		return citas;
	}

	public void setCitas(HashSet<Cita> citas) {
		this.citas = citas;
	}
	
}
