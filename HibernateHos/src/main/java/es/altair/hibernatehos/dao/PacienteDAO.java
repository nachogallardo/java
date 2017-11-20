package es.altair.hibernatehos.dao;

import es.altair.hibernatehos.bean.Paciente;

public interface PacienteDAO {
	public void guardar(Paciente p);
	public Paciente get(int i);
	public void actualizar(Paciente p);
	public void borrar(Paciente p);
	
}
