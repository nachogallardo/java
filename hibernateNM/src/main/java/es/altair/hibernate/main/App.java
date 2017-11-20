package es.altair.hibernate.main;

import es.altair.hibernate.bean.Modulo;
import es.altair.hibernate.bean.Profesor;
import es.altair.hibernate.dao.ProfesorDAO;
import es.altair.hibernate.dao.ProfesorDAOImpHibernate;


public class App 
{
    public static void main( String[] args )
    {
    	ProfesorDAO profDAO= new ProfesorDAOImpHibernate();
    	
    	Profesor p= new Profesor(5000,"profe5000","Ape 5000","ape2 5000");
    	Modulo m1= new Modulo(11, "mod11");
    	Modulo m2= new Modulo(12, "mod12");
    	
    	p.getModulos().add(m1);
    	p.getModulos().add(m2);
    	
    	m1.getProfesores().add(p);
    	m2.getProfesores().add(p);
    	
    	profDAO.save(p);
    }
}
