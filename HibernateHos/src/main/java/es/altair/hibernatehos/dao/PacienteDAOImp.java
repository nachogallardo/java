package es.altair.hibernatehos.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernatehos.bean.Paciente;

public class PacienteDAOImp implements PacienteDAO {

	public void guardar(Paciente p) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
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



	public void actualizar(Paciente p) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.update(p);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}


	}

	public void borrar(Paciente p) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.delete(p);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}


	}



	public Paciente get(int i) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		Paciente p=null;
		try {
			sesion.beginTransaction();
			p=sesion.get(Paciente.class, i);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}

		return p;
	}

}
