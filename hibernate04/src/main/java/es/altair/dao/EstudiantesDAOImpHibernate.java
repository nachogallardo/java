package es.altair.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.bean.Estudiantes;

public class EstudiantesDAOImpHibernate implements EstudianteDAO {

	public void save(Estudiantes e) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(e);
			sesion.getTransaction().commit();
		} catch (Exception e2) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}

	}

}
