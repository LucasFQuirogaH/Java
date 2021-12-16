package logica;

/**
 *
 * @author lucquifer
 */
public class Usuario {

    //  Atributos  -----------------------------------------------------------------------------------------------------------------------------
    private int id;
    private String nombreUsu;
    private String contrasenia;

    // Relaciones  --------------------------------
    private Empleado emple;

    //  Constructores  ----------------------------------------------------------------------------------------------------------------------

    public Usuario() {
    }

    public Usuario(int id, String nombreUsu, String contrasenia, Empleado emple) {
        this.id = id;
        this.nombreUsu = nombreUsu;
        this.contrasenia = contrasenia;
        this.emple = emple;
    }
    
    //  Getters & Setters  -----------------------------------------------------------------------------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }
    
}
