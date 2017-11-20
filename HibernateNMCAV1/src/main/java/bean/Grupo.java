package bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="grupos")
public class Grupo implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idGrupo;
	private String nombre;
	
	//1-N desde grupo a usuariosgrupos
	@OneToMany(mappedBy="primaryKey.grupo",cascade=CascadeType.ALL)
	private Set<UsuarioGrupo> usuarios= new HashSet<UsuarioGrupo>();
	
	

	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Grupo() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Set<UsuarioGrupo> getUsuariosgrupos() {
		return usuarios;
	}

	public void setUsuarios(Set<UsuarioGrupo> usuarios) {
		this.usuarios = usuarios;
	}

	
	
	
}
