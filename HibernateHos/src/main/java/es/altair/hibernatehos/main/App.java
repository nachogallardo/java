package es.altair.hibernatehos.main;

import java.util.HashSet;

import es.altair.hibernatehos.bean.Cita;
import es.altair.hibernatehos.bean.Paciente;
import es.altair.hibernatehos.dao.CitaDAO;
import es.altair.hibernatehos.dao.CitaDAOImp;
import es.altair.hibernatehos.dao.PacienteDAO;
import es.altair.hibernatehos.dao.PacienteDAOImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CitaDAO c= new CitaDAOImp();
        PacienteDAO p= new PacienteDAOImp();
        
        Paciente p1= new Paciente("yo", "4356536L", 772747283);
        Cita c1= new Cita("26/10/17 20:30", "Pierna rota");
        Cita c2= new Cita("30/02/18 22:00", "brazo roto");
        Cita c3= new Cita("4/08/15 14:20", "nariz rota");
        Cita c4= new Cita("2/04/12 10:45", "cabeza rota");
        
        HashSet<Cita> citas= new HashSet<Cita>();
        citas.add(c1);
        citas.add(c2);
        citas.add(c3);
        citas.add(c4);
        p1.setCitas(citas);
        
        p.guardar(p1);
    }
}
