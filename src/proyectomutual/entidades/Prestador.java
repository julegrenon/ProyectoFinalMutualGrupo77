package proyectomutual.entidades;


public class Prestador {
    
    private int idPrestador;
    private String nombre;
    private int dni;
    private String domicilio;
    private int telefono;
    private Especialidad especialidad;
    private boolean activo;

    public Prestador() {
    }

    public Prestador(int idPrestador, String nombre, int dni, String domicilio, int telefono, Especialidad especialidad, boolean activo) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public Prestador(String nombre, int dni, String domicilio, int telefono, Especialidad especialidad, boolean activo) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.activo = activo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }
    
}
