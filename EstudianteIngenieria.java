public class EstudianteIngenieria {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Teléfono;
    private int NumeroSemestre;
    private float acumulado;
    private String SerialEquipo;

    public EstudianteIngenieria() {
    }

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String teléfono, int numeroSemestre,
            float acumulado, String serialEquipo) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Teléfono = teléfono;
        NumeroSemestre = numeroSemestre;
        this.acumulado = acumulado;
        SerialEquipo = serialEquipo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String teléfono) {
        Teléfono = teléfono;
    }

    public int getNumeroSemestre() {
        return NumeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        NumeroSemestre = numeroSemestre;
    }

    public float getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(float acumulado) {
        this.acumulado = acumulado;
    }

    public String getSerialEquipo() {
        return SerialEquipo;
    }

    public void setSerialEquipo(String serialEquipo) {
        SerialEquipo = serialEquipo;
    }

}
