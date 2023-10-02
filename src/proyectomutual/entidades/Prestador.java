package proyectomutual.entidades;


public class Prestador {
    
    private int idPrestador;
    private String nombre;
    private int DNI;
    private String domicilio;
    private int telefono;
    private String especialidad;
    private boolean estado;

    public Prestador() {
    }

    public Prestador(int idPrestador, String nombre, int DNI, String domicilio, int telefono, String especialidad, boolean estado) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
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
    
}
