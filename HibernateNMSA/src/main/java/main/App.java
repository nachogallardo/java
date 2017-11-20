package main;

import bean.Grupo;
import bean.Usuario;
import dao.GrupoDAO;
import dao.GrupoDAOImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GrupoDAO gDAO= new GrupoDAOImp();
        Grupo g1= new Grupo("g1");
        Usuario u1 = new Usuario("u1","1234","u1@u1.com");
        Usuario u2 = new Usuario("u2","4332","u2@u2.com");
        
        g1.getUsuarios().add(u1);
        g1.getUsuarios().add(u2);
        
        u1.getGrupos().add(g1);
        u2.getGrupos().add(g1);
        
        gDAO.save(g1);
    }
}
