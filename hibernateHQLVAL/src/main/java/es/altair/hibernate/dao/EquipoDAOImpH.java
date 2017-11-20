package es.altair.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import es.altair.hibernate.bean.Equipo;

public class EquipoDAOImpH implements EquipoDAO {

	public List<Equipo> listado() {
		List<Equipo> equipos= new ArrayList<Equipo>();
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		try {
			sesion.beginTransaction();
			equipos=sesion.createQuery("From Equipo").list();
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}
		return equipos;
	}

	public List<Object[]> listadoNombreySocios() {
		List<Object[]> equipos= new ArrayList<Object[]>();
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		try {
			sesion.beginTransaction();
			equipos=sesion.createQuery("SELECT e.nombre,e.numSocios From Equipo e").list();
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}
		return equipos;
	}

	public Equipo obtener(int i) {
		Equipo equipo=null;
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		try {
			sesion.beginTransaction();
			//equipo=(Equipo) sesion.createQuery("From Equipo where idEquipo="+i).uniqueResult();
			equipo=(Equipo) sesion.createQuery("From Equipo where idEquipo=:id").setParameter("id", i).uniqueResult();
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}
		return equipo;
	}

	public Equipo obtenerCS(String string, int i) {
		Equipo equipo=null;
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		try {
			sesion.beginTransaction();
			//equipo=(Equipo) sesion.createQuery("From Equipo where idEquipo="+i).uniqueResult();
			equipo=(Equipo) sesion.createQuery("From Equipo where ciudad=:ciudad and numSocios=:num").setParameter("ciudad", string).setParameter("num", i).uniqueResult();
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}
		return equipo;
	}

	public List<Equipo> listadoPorSocios(int num) {
		List<Equipo> equipos= new ArrayList<Equipo>();
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sesion= sf.openSession();
		try {
			sesion.beginTransaction();
			equipos=sesion.createCriteria(Equipo.class).add(Restrictions.gt("numSocios", num)).addOrder(Order.desc("numSocios")).list();
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sesion.close();
			sf.close();
		}
		return equipos;
	}

}
