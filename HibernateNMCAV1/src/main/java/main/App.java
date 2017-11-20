package main;

import java.util.Date;

import bean.Grupo;
import bean.Usuario;
import bean.UsuarioGrupo;
import dao.GrupoDAO;
import dao.GrupoDAOImp;
import dao.UsuarioDAOImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GrupoDAO gDAO= new GrupoDAOImp();
        UsuarioDAOImp uDAO= new UsuarioDAOImp();
        Grupo g1= new Grupo("g1");
        Usuario u1 = new Usuario("u1","1234","u1@u1.com");
        Usuario u2 = new Usuario("u2","4332","u2@u2.com");
        
       
        UsuarioGrupo usugru= new UsuarioGrupo();
        usugru.setUsuario(u1);
        usugru.setGrupo(g1);
        usugru.setActivado(true);
        usugru.setFecha_registro(new Date());
        
        u1.getUsuariogrupos().add(usugru);
        g1.getUsuariosgrupos().add(usugru);
        
        gDAO.save(g1);
        uDAO.save(u1);
        
        
        gDAO.save(g1);
    }
}
