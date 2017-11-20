package es.altair.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.bean.UsuarioGrupo;

public class UsuarioGrupoDAOImpH implements UsuarioGrupoDao {

	public void save(UsuarioGrupo ug) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		try {
			sesion.beginTransaction();
			sesion.save(ug);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}

	}

}
