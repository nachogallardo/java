package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Grupo;

public class GrupoDAOImp implements GrupoDAO {

	public void save(Grupo g) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(g);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}

	}

}
