package es.altair.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernate.bean.Jugador;

public class JugadorDAOImpH implements JugadorDAO {

	public List<Jugador> listar() {
		List<Jugador> jugadores=null;
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		try {
			sesion.beginTransaction();
			jugadores=sesion.createSQLQuery("select * from jugador").addEntity(Jugador.class).list();
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}
		return jugadores;
	}

}
