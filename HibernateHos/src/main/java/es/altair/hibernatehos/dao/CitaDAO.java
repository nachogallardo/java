package es.altair.hibernatehos.dao;

import es.altair.hibernatehos.bean.Cita;

public interface CitaDAO {
	public void guardar(Cita c);
	public Cita get(int i);
	public void actualizar(Cita c);
	public void borrar(Cita c);
}
