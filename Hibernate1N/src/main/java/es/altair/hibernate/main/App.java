package es.altair.hibernate.main;

import es.altair.hibernate.bean.Equipo;
import es.altair.hibernate.bean.Jugador;
import es.altair.hibernate.dao.EquipoDAO;
import es.altair.hibernate.dao.EquipoDAOImp;
import es.altair.hibernate.dao.JugadorDAO;
import es.altair.hibernate.dao.JugadorDAOImp;

public class App 
{
    public static void main( String[] args )
    {
        JugadorDAO j= new JugadorDAOImp();
        EquipoDAO e= new EquipoDAOImp();
        
        Equipo eq= new Equipo(1, "SevillaFC", "Sevilla", 42500);
        Jugador ju=new Jugador(1, "SergioRico", "Portero", eq);
        
        e.guardar(eq);
        j.guardar(ju);
        
        //e.actualizar(eq, 1);
        //j.actualizar(ju, 1);
        
        //j.borrar(1);
        //e.borrar(1);
        
    }
}
