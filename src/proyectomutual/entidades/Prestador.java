package proyectomutual.entidades;


public class Prestador {

    private int idPrestador;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String domicilio;
    private Especialidad especialidad;
    private boolean estado;

    public Prestador() {
    }

    public Prestador(String nombre, String apellido, int dni, int telefono, String domicilio, Especialidad especialidad, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public Prestador(int idPrestador, String nombre, String apellido, int dni, int telefono, String domicilio, Especialidad especialidad, boolean estado) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.especialidad = especialidad;
        this.estado = estado;
    }
    
    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    @Override
    public String toString() {

        return "ID: " + idPrestador + " - Especialidad: " + especialidad.getEspecialidad() + " - DNI: " + dni + " - Apellido: " + apellido + " - Nombre:" + nombre;
    }
    
}
