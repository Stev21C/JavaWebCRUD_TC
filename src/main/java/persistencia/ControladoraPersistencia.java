/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import logica.Usuario;

/** Metodos del lado de la DB
 *
 * @author Steven
 */
public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    
    
    // Create
    public void crearUsuario(Usuario usr){
        
        usuarioJpa.create(usr);  //Crea obj del tipo Usuarios
        
    }
    
    // Read
    public List<Usuario> leerUsuarios(){
        
        return usuarioJpa.findUsuarioEntities();  //Retorna lo del metodo usuarioJpa
        
    }
    
}
