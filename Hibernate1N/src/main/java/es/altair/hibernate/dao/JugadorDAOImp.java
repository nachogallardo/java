package es.altair.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernate.bean.Jugador;

public class JugadorDAOImp implements JugadorDAO {

	public void guardar(Jugador j) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(j);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}

	}

	public void borrar(int idJugador) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		Jugador aux=(Jugador)sesion.get(Jugador.class, idJugador);
		try {
			sesion.beginTransaction();
			sesion.delete(aux);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}
		
	}

	public void actualizar(Jugador j,int idJugador) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		Jugador aux=(Jugador)sesion.get(Jugador.class, idJugador);
		aux.setIdJugador(j.getIdJugador());
		aux.setNombre(j.getNombre());
		aux.setPosicion(j.getPosicion());
		aux.setEquipo(j.getEquipo());
		try {
			sesion.beginTransaction();
			sesion.update(aux);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}
		
	}

}
