package es.altair.hibernate.dao;

import es.altair.hibernate.bean.Equipo;

public interface EquipoDAO {
	public void guardar(Equipo e);
	public void borrar(int idEquipo);
	public void actualizar(Equipo e,int idEquipo);
}
