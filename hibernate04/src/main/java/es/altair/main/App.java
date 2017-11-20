package es.altair.main;

import es.altair.bean.Clases;
import es.altair.bean.Estudiantes;
import es.altair.dao.EstudianteDAO;
import es.altair.dao.EstudiantesDAOImpHibernate;


public class App 
{
    public static void main( String[] args )
    {
        EstudianteDAO eDAO=new EstudiantesDAOImpHibernate();
        Estudiantes e1=new Estudiantes(1, "nombre", "apellidos", 20);
        Clases c1= new Clases(1, "titulo", "descripcion", 4); 
        Clases c2= new Clases(2, "titulo1", "descripcion1", 6); 
        Clases c3= new Clases(3, "titulo2", "descripcion2", 2); 
        
        e1.getClases().add(c1);
        e1.getClases().add(c2);
        e1.getClases().add(c3);
        
        c1.getEstudiantes().add(e1);
        c2.getEstudiantes().add(e1);
        c3.getEstudiantes().add(e1);
        
        eDAO.save(e1);
    }
}
