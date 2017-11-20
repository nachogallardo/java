package es.altair.main;

import java.util.Date;

import es.altair.bean.Grupo;
import es.altair.bean.Usuario;
import es.altair.bean.UsuarioGrupo;
import es.altair.dao.UsuarioGrupoDAOImpH;
import es.altair.dao.UsuarioGrupoDao;

public class App 
{
    public static void main( String[] args )
    {
        UsuarioGrupoDao ugDao= new UsuarioGrupoDAOImpH();
        
        Usuario u1= new Usuario("u1", "12234", "u1@u1.es");
        Grupo g1= new Grupo("g1");
        
        UsuarioGrupo ug= new UsuarioGrupo( u1, g1, true, new Date());
        
        ugDao.save(ug);
    }
}
