package es.altair.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernate.bean.Equipo;

public class EquipoDAOImp implements EquipoDAO {

	public void guardar(Equipo e) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(e);
			sesion.getTransaction().commit();
		} catch (Exception e2) {
			e2.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}
	}

	public void borrar(int idEquipo) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		Equipo aux=(Equipo)sesion.get(Equipo.class, idEquipo);
		try {
			sesion.beginTransaction();
			sesion.delete(aux);
			sesion.getTransaction().commit();
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}
		
	}

	public void actualizar(Equipo e,int idEquipo) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		Equipo aux=(Equipo)sesion.get(Equipo.class, idEquipo);
		aux.setIdEquipo(e.getIdEquipo());
		aux.setCiudad(e.getCiudad());
		aux.setNombre(e.getNombre());
		aux.setNumSocios(e.getNumSocios());
		try {
			sesion.beginTransaction();
			sesion.update(aux);
			sesion.getTransaction().commit();
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}
		
	}

}
