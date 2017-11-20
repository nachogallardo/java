package es.altair.hibernate.dao;

import java.util.List;

import es.altair.hibernate.bean.Equipo;

public interface EquipoDAO {

	List<Equipo> listado();

	List<Object[]> listadoNombreySocios();

	Equipo obtener(int i);

	Equipo obtenerCS(String string, int i);

	List<Equipo> listadoPorSocios(int num);
	
}
