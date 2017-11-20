package es.altair.hibernate.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;
@Entity
@Table(name="equipo")
public class Equipo implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEquipo;
	private String nombre;
	private String ciudad;
	private int numSocios;
	
	@OneToMany(mappedBy="equipo",cascade=CascadeType.ALL)
	@JoinColumn(name="idEquipo")
	private List<Jugador> jugadores;

	public Equipo() {
		super();
	}

	public Equipo(int idEquipo, String nombre, String ciudad, int numSocios) {
		super();
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numSocios = numSocios;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumSocios() {
		return numSocios;
	}

	public void setNumSocios(int numSocios) {
		this.numSocios = numSocios;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	

	
	
	
}
