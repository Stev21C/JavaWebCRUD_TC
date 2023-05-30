/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persitencia.exceptions.NonexistentEntityException;

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

    public void borrarUsuario(int idEliminar) {
        try {
            usuarioJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idEditar) {
       return usuarioJpa.findUsuario(idEditar);
    }

    public void editarUsuario(Usuario usr) {
        try {
            usuarioJpa.edit(usr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
