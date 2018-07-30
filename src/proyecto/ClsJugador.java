package proyecto;
import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class ClsJugador implements Serializable{
    
    private int id;
    private String nombre;
    private String apellido;
    private int cedula;
    private String usuario;

    public ClsJugador() {
    }

    public ClsJugador(int id, String nombre, String apellido, int cedula, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido ;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
