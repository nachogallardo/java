package es.altair.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernate.bean.Profesor;

public class ProfesorDAOImpHibernate implements ProfesorDAO {

	public void save(Profesor p) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(p);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}

	}

}
