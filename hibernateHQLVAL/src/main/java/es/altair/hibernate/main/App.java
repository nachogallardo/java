package es.altair.hibernate.main;

import java.util.ArrayList;
import java.util.List;

import es.altair.hibernate.bean.Equipo;
import es.altair.hibernate.bean.Jugador;
import es.altair.hibernate.dao.EquipoDAO;
import es.altair.hibernate.dao.EquipoDAOImpH;
import es.altair.hibernate.dao.JugadorDAO;
import es.altair.hibernate.dao.JugadorDAOImpH;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EquipoDAO eDAO= new EquipoDAOImpH();
        JugadorDAO jDAO=new JugadorDAOImpH();
        
        List<Equipo> equipos=new ArrayList<Equipo>();
        List<Jugador> jugadores=new ArrayList<Jugador>();
        List<Object[]> equiposN=new ArrayList<Object[]>();
//        System.out.println("LISTADO DE EQUIPOS");
//        equipos=eDAO.listado();
//        for (Equipo equipo : equipos) {
//			System.out.println(equipo);
//		}
//        System.out.println("LISTADO DE EQUIPOS(NOMBRE Y NUMERO DE SOCIOS)");
//        equiposN=eDAO.listadoNombreySocios();
//        for (Object[] objects : equiposN) {
//        	System.out.println(objects[0]+","+objects[1]);
//		}
//        System.out.println("obtener equipo por el id");
//        System.out.println(eDAO.obtener(2));
//        System.out.println("obtener equipo por ciudad y socio");
//        System.out.println(eDAO.obtenerCS("Cadiz",28000));
        System.out.println("LISTADO DE JUGADORES EN SQL");
        jugadores= jDAO.listar();
        for (Jugador jugador : jugadores) {
        	System.out.println(jugador);
		}
        System.out.println("LISTADO DE EQUIPOS CON MAS DE 40000 SOCIOS");
        equipos=eDAO.listadoPorSocios(40000);
        for (Equipo equipo : equipos) {
			System.out.println(equipo);
		}
    }
}
