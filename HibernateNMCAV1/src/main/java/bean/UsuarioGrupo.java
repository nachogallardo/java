package bean;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="usuariosgrupos")
@AssociationOverrides({
		@AssociationOverride(name="primaryKey.usuario",joinColumns=@JoinColumn(name="idUsuario")),@AssociationOverride(name="primaryKey.grupo",joinColumns=@JoinColumn(name="idGrupo"))
})
public class UsuarioGrupo implements Serializable{
	//se utiliza para incrustar una clase de id como la clave primaria de esta 
	//asignacion.al utilizar la anotacion EmbeddedId,hay que utilizar la anotacion
	// associatonoverride para sobreescribir
	//el mapeo de los atributos usuario y grupo de la clase compuesta del id
	@EmbeddedId
	private UsuariosGruposId primaryKey=new UsuariosGruposId();
	
	private boolean activado;
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;
	
	public UsuarioGrupo() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioGrupo(UsuariosGruposId primaryKey, boolean activado, Date fecha_registro) {
		super();
		this.primaryKey = primaryKey;
		this.activado = activado;
		this.fecha_registro = fecha_registro;
	}

	public UsuariosGruposId getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(UsuariosGruposId primaryKey) {
		this.primaryKey = primaryKey;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	@Transient
	public Usuario getUsuario() {
		return primaryKey.getUsuario();
	}
	@Transient
	public Grupo getGrupo() {
		return primaryKey.getGrupo();
	}
	public void setUsuario(Usuario usuario) {
		getPrimaryKey().setUsuario(usuario);
	}
	public void setGrupo(Grupo grupo) {
		getPrimaryKey().setGrupo(grupo);
	}
	
	
}
