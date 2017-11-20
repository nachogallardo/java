package es.altair.hibernate.dao;

import es.altair.hibernate.bean.Jugador;

public interface JugadorDAO {
	public void guardar(Jugador j);
	public void borrar (int idJugador);
	public void actualizar(Jugador j,int idJugador);
}
